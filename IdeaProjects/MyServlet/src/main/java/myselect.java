import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class myselect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置页面编码
        resp.setCharacterEncoding("utf-8");
        //设置返回的数据类型
        resp.setContentType("text/html");
        String num1=req.getParameter("num1");
        String num2=req.getParameter("num2");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("获得了第一个参数:"+num1);
        printWriter.println("获得了第二个参数:"+num2);

    }
}
