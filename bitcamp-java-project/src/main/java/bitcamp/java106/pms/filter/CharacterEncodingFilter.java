// 클라이언트가 보낸 데이터의 문자집합을 지정하는 필터

package bitcamp.java106.pms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") //모든 서블릿에 실행하기 전에 작업을 수행하는 필터
public class CharacterEncodingFilter implements Filter {
        FilterConfig config;
        String encoding= "UTF-8";
        //기본 인코딩 값을 UTF-8로 설정
        
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        
        if(config.getInitParameter("encoding")!= null) { //web.xml 파일의 Filter 태그의 'CharacterEncodingFilter'로 선언된  filter-name 태그 
                                                         //내부의  <param-name>encoding</param-name>로 설정된 param-value태그의 값을 가져온다.
                                                         //만약에 getInitParameter() 메서드로 가져온 값이 null이 아니라면 활성화한 config 변수에 
                                                         //해당값을 넣는다.
            this.encoding = config.getInitParameter("encoding"); 
            
        }
    }
    
    @Override
    public void destroy() {
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        
        //서블릿을 실해아기 전에 클라이어트가 보낸 데이터에 대해 문자표(charset)를 알려준다.
        request.setCharacterEncoding(this.encoding); //init()메서드를 통해 얻은 config 값 혹은 위에서 설정한 default 'utf-8'을 request 객체에
                                                     //선언함으로써 charset을 알려준다.
    
        //다음 필터가 있따면 그 필터의 doFilter를 호출하고,
        // 없다면 요청한 서블릿의 service()를 호출한다.
        chain.doFilter(request, response);
        
        //service() 호출한 후에 특별히 처리할 작업이 있다면 여기에 작성한다.
    }
}








