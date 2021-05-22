package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    private static final int port=9013;
    private static final int blength=1024;
    public static void main(String[] args) throws IOException {
        //启动一个udp服务器
        DatagramSocket socket=new DatagramSocket(port);
        System.out.println("服务器已启动！");
        while(true){
            //实例化一个数据报
            DatagramPacket clientPacket=new DatagramPacket(new byte[blength],blength);
            //等待客户端连接
            socket.receive(clientPacket);
            //执行到这儿，说明已经有客户连接了
            //接收客户端信息
            String msg=new String(clientPacket.getData());
            System.out.println("接收到客户端信息："+msg);
            //给客户端一个响应
            String serMsg=msg.replace("吗？",".");
            DatagramPacket serPacket=new DatagramPacket(serMsg.getBytes(),
                    serMsg.getBytes().length,
                    clientPacket.getAddress(),
                    clientPacket.getPort());
            socket.send(serPacket);
        }
    }
}
