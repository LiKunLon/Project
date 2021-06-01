import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcAjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        int succ=-1;//1表示成功
        String msg="";
        int sum=0;
        String num1=request.getParameter("number1");
        String num2=request.getParameter("number2");
        if(num1!=null && num2!=null &&!num1.equals("") && !num2.equals("")){
            sum=Integer.parseInt(num1)+Integer.parseInt(num2);
            succ=1;
        }else {
            msg="输入有误!";
        }
        PrintWriter printWriter=response.getWriter();
        //{"succ":%d,"msg":"%s","sum":%d}
        printWriter.println(String.format("{\"succ\":%d,\"msg\":\"%s\",\"sum\":%d}",succ,msg,sum));

    }
}
