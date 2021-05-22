package udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    private static final int port=9013;
    private static final String ip="127.0.0.1";
    private static final int blength=1024;
    public static void main(String[] args) throws IOException {

        DatagramSocket client=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("我：");
            String msg=sc.nextLine();
            //给服务器发送消息
            DatagramPacket clientPacket=new DatagramPacket(msg.getBytes(),
                    msg.getBytes().length,
                    InetAddress.getByName(ip),
                    port
                    );
            client.send(clientPacket);
            //接收服务器返回消息
            DatagramPacket serPacket=new DatagramPacket(new byte[blength],blength);
            client.receive(serPacket);
            //输出一下服务器返回的消息
            String serMsg=new String(serPacket.getData());
            System.out.println("返回消息："+serMsg);
        }
    }
}
