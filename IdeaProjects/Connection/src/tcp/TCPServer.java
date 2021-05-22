package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private static final int port=9002;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(port);
        System.out.println("服务器已启动！");
        Socket clientSocket=serverSocket.accept();
        System.out.println(String.format("已经有客户端连接了，IP:%s,端口:%d",
                clientSocket.getInetAddress().getHostAddress(),
                clientSocket.getPort()));
        //JDK 7 try-resource
        try(
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            BufferedReader reader=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ){
            while(true){
                //接收客户端消息
                String msg=reader.readLine();
                if(msg!=null && !msg.equals("")){
                    System.out.println("接收到客户端消息："+msg);
                }
                //给客户端返回消息
                String serMsg="我收到了！";
                writer.write(serMsg+"\n");//\n不能省略。边界
                // 发送缓冲区刷新操作【执行此步骤意味着里面将缓冲区的消息发送出去】
                writer.flush();
            }
        }

    }
}
