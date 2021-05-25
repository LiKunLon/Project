import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class GetSession extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        String name=request.getParameter("name");
        String password=request.getParameter("password");

        PrintWriter printWriter=response.getWriter();
        if(name!=null && password!=null && name.equals("root") && password.equals("123")){
            //登陆成功,肯定会有一个session
            HttpSession session=request.getSession();
            String sessionId=session.getId();
            printWriter.println("<h1>登陆成功</h1>");
            printWriter.println(String.format("<h2>SessionId:%s</h2>",sessionId));
            //登陆次数
            String countKey="countkey";
            if(session.isNew()||
                           session.getAttribute(countKey)==null){
                session.setAttribute(countKey,1);
                printWriter.println("<h3>访问次数:1</h3>");
            }else{
                int count= (int) session.getAttribute(countKey);
                count++;
                session.setAttribute(countKey,count);
                printWriter.println(String.format("<h4>访问次数:%d</h4>",count));
            }
        }else{
            printWriter.println("用户名或密码错误!");
        }
    }

}
