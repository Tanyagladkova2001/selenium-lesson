package httpSockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class httpSocket {

    public static void main(String[] args) throws IOException {
        System.out.println(socketRequest());

        String[] responseString = socketRequest().split("\r\n");
        String statusCode = responseString[0].split("\s")[1];
        String reason = responseString[0].split("\s")[2];
        System.out.printf("Status code - %s, Reason - %s", statusCode, reason);
    }


        public static String socketRequest () throws IOException {
            Socket client = null;
            StringBuilder response = new StringBuilder();
            try {
                client = new Socket("www.google.com", 80);
                InputStream is = client.getInputStream();
                OutputStream os = client.getOutputStream();
                String request = "GET /index.html HTTP/1.1\r\nHost:www.google.com\r\n\r\n";
                os.write(request.getBytes());
                os.flush();
                int charCode = 0;
                while (true) {
                    charCode = is.read();
                    response.append((char) charCode);
                    if (charCode == -1 || response.toString().endsWith("</html>")) {
                        break;
                    }
                    System.out.println("body");
                        charCode = is.read();
                        response.append((char) charCode);
                        if (charCode == -1 || response.toString().endsWith("</html>")) {
                            break;
                        }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                client.close();
            }
            return response.toString();
        }
    }

