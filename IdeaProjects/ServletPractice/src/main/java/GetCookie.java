import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class GetCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        Cookie cookie=new Cookie("username","Longlong");
        //cookie存活时间
        cookie.setMaxAge(60);
        //写入cookie语句(重要)
        response.addCookie(cookie);

        //创建第二个
        Cookie cookie1=new Cookie("password","123");
        //浏览器关闭,cookie失效
        cookie1.setMaxAge(-1);
        response.addCookie(cookie1);

        response.setIntHeader("refresh",1);
        PrintWriter printWriter=response.getWriter();
        printWriter.println(String.format("<h1>cookie写入成功!当前时间:%s</h1><p></p>",new Date()));
    }
}
