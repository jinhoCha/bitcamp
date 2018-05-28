// 모든페이지에서 공통헤더를
package bitcamp.java106.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bitcamp.java106.pms.domain.Member;

@SuppressWarnings("serial")
@WebServlet("/header")
public class HeaderServlet extends HttpServlet {
    @Override
    protected void service(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        // 이 서블릿을 include하는 쪽에서 이미 출력스트림의 콘텐트 타입을 설정하기 때문에
        // 이 서블릿에서는 콘텐트 타입을 설정할 필요가 없다.
        // 안써도 된다 !!!!!!!!!!!  response.setContentType("text/html);charset=UTF-8");
       PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        Member loginUser = (Member)session.getAttribute("loginUser");
        out.println("<div id='header'>");
        if(loginUser != null) {
            out.printf("    %s", loginUser.getId());
            out.printf("<a href='%s/auth/logout'>로그아웃</a>",
                    request.getContextPath());
        }else {
            out.printf("<a href='%s/auth/login'>로그인</a>",
                    request.getContextPath());
        }
        out.println("</div>");

    }
}



















