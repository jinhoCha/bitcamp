// 다른 서블릿의 작업을 포함하기 - include
package step09.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step09/ex1/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("  <meta charset='UTF-8'>");
        out.println("  <title>exam01</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>exam01 실행!</h1>\n");
        out.println("</body>");
        out.println("</html>");
        //콘솔창에 서블릿이 실행되었음을 표시하기 위해  출력한다
        // -> 필터의 실행과 서블릿의 실행 순서를 확인하기 위함이다.
        System.out.println("/step09/ex1/exam01 실행");
        
        /* 실행결과
          
             Fliter1.doFilter() : before                Fliter1에서 System.out.println("Fliter1.doFilter() : before");을 실행
             /step09/ex1/exam01 실행                                                      chain.doFilter(request, response);로 인해 /step09/ex1/exam01 실행
             Fliter1.doFilter() : after                 서블릿이 실행한후 chain.doFilter다음인 System.out.println("Fliter1.doFilter() : after");
          
          
          c => Servlet container => doFilter() => filter1 => before 문구찍고 => chain.doFilter() => service()호출해서 
          => Exam01 하고난후 => 리턴받아서 chain.doFilter()=> after출력후 => Servlet Container간후 => c 응답한다.
          
         */
    }
}






