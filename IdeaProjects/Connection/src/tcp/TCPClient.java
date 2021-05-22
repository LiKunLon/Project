package tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private static final int port = 9002;
    private static final String ip = "127.0.0.1";

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(ip, port);
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                Scanner scanner = new Scanner(System.in);
        ) {
            while (true) {
                System.out.print("->");
                // 3.构建消息
                String msg = scanner.nextLine();
                // 4.发送消息
                writer.write(msg + "\n");
                // 将发送缓冲区的消息立即发送
                writer.flush();
                // 5.接收服务器端的消息
                String serMsg = reader.readLine();
                if (serMsg != null && !serMsg.equals("")) {
                    System.out.println("服务器端返回：" + serMsg);
                }
            }
        }
    }


}
