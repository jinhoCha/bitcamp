// 서블릿 만들기

package step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//javax.servlet.Servlet 규칙에 따라 클래스를 만들어야 한다.
// => Servlet 인터페이스
// 호출자? 즉 이 규칙에 따라 호출자하는 자는 누구냐??
// 서블릿 컨테이너(servlet container)이다.
// ex) 톰캣 서버..!
// => 일반적으로 실행할 수 있는 자바 클래스를 만들 듯이 main() 메서드를 만들어봐야 소용없다.
// =>서블릿 컨테이너가 호출할 클래스이기 때문에
//=>서블릿 컨테이너가 호출 하는 메서드를 갖는 클래스를 만들어야 한다.
// => 서블릿 컨테이너가 어떤 메서드를 호출할지 이미 규칙으로 정의되어 있다.
// 바로 그 규칙이 Servlet 인터페이스인것이다.
@WebServlet("/step01/exam01")
public class Exam01 implements Servlet{
    ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        
        System.out.println("Exam01.init()");
        this.config = config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
      // 클라이언트가 이 서블릿의 실행을 요청할 때마다 호출된다.
        // -> 서블릿이 해야할 일을 처리하는 코드를 여기에 둔다.
        System.out.println("Exam01.service()");
        
    }
    
    @Override
    public void destroy() {
     // 웹 어플리케이션 멈추거나 서블릿 컨테이너를 종료할 떄 호출된다.
        // => init()에서 준비한 자원을 해제시키는 코드를 여깅 ㅔ둔다.
        System.out.println("Exam01.destroy()");
        
    }
    
    @Override
    public String getServletInfo() {
        System.out.println("Exam01.getServletInfo()");
        return null;
    }
    
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("Exam01.getServletConfig()");
        return null;
    }
}
