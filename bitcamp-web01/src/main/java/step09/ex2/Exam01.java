// ServletRequestAttributeListener
package step09.ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step09/ex2/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        // 테스트 : http://192.168.0.15:8888/bitcamp-web01/step09/ex2/exam01?name=aaa&age=20
        // 파라미터로부터 받은 값을 ServletRequest에 저장해보자!
        // 1) 파라미터 값을 꺼낸다.
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        
        // 2) ServletRequest에 저장한다.
        request.setAttribute("이름", name);
        request.setAttribute("나이", age);
        System.out.println("---------------------------");
        
        // 3) ServeltRequest값에 저장된 값을 변경한다.
        request.setAttribute("이름", "우하하하");
        
        
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
        
        /* 실행결과
         *      Listener1.contextInitialized() - Mon May 21 16:14:52 KST 2018
                Filter1.init
                Filter2.init
                step07.Exam02() 호출!
                step07.Exam02.init() 호출!
                
                --------------------웹브라우저로 실행햇을때------------------
                // 테스트 : http://192.168.0.15:8888/bitcamp-web01/step09/ex2/exam01?name=20&age=20
                Listener2.requestInitialized()
                [192.168.0.15] : /step09/ex2/exam01
                Listener3.attributeReplaced()
                org.apache.catalina.ASYNC_SUPPORTED=false(true) 변경
                Listener3.attributeAdded()
                                        이름=20 저장
                Listener3.attributeAdded()
                                        나이=20 저장
                ---------------------------
                Listener3.attributeReplaced()
                                        이름=우하하하(20) 변경
                Listener2.requestDestroyed()
                          
         */
    }
}






