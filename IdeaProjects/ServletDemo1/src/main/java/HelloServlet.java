import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码格式和返回数据类型
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        //2.业务实现
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<h1 style='color:green;text-align: center'>Hello,龙哥!</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
