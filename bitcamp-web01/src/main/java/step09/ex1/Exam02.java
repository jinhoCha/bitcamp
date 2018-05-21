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
@WebServlet("/step09/ex1/exam02")
public class Exam02 extends HttpServlet {
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
        out.println("  <title>exam02</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>exam02 실행!</h1>\n");
        out.println("</body>");
        out.println("</html>");
        //콘솔창에 서블릿이 실행되었음을 표시하기 위해  출력한다
        // -> 필터의 실행과 서블릿의 실행 순서를 확인하기 위함이다.
        System.out.println("/step09/ex1/exam02 실행");
        
        /* 실행결과
          
             Fliter1.doFilter() : before                Fliter1에서 System.out.println("Fliter1.doFilter() : before");을 실행
             Fliter2.doFilter() : before                doFilter로 통해 Filter1을 호출
             /step09/ex1/exam02 실행                                                     service()
             Fliter2.doFilter() : after                 exam02 -> Filter1으로 이동
             Fliter1.doFilter() : after                 Filter1 -> Filter2로 이동    참고!! 순서는 상관이없다.
          
             c => /step09/ex1/exam02 => serlvet Container => doFilter() => filter2 => doFilter => filter1 => service => exam02
             =>Filter1 => Filter2=> Servlet Container => c로 응답
          
          
          
         */
    }
}






