import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class calc extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        int num1=Integer.parseInt(req.getParameter("number1"));
        int num2=Integer.parseInt(req.getParameter("number2"));
        int total=num1+num2;
        PrintWriter printWriter=resp.getWriter();
        printWriter.println(String.format("<h1>计算结果为:%d</h1>",total));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
