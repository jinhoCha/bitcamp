// 요청 핸들러의 파라미터 - 콘텐트를 직접 리턴하기
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam06_1") 
public class Exam06_1 {
    
    // request handler에서 콘텐트를 직접 리턴할 때는 
    // 메서드 선언부에 @ResponseBody를 붙여야 한다.
    @GetMapping(value="m1")  
    @ResponseBody  
    public String m1() {
        // 응답 콘텐트의 타임은 기본으로
        // "text/html;charset=ISO-8859-1" 이다.
        // 한글을 출력할 때 ISO-8895-1에 정의되어 있지 않기 때문에
        // 출력할 때 ? 문자로 바뀌어 출력된다.
        return "Exam06_2.m1() ==> 012ABCabc#!@가각";
    }

    
    // request handler에서 콘텐트를 직접 리턴할 때는
    // 메서드 선언부에 @ResponseBody를 붙여야 한다.
    @GetMapping(value="m2", produces="text/plain;charset=UTF-8")  
    @ResponseBody  
    public String m2() {
        // @ResponseBody로 콘텐트를 출력할 때
        // Content-Type 설정하고 싶다면,
        // @RequestMapping,@GetMapping, @PostMapping 애노테이션에서
        // produeces 속성에 콘텐트 타입을 지정하라!
        // 원래 produces는 클라이언트의 HTTP 요청 헤더인 Accept 값과 일치하는 지 비교할 때 
        //  사용하는 속성이지만,
        // 이렇게 콘텐트를 직접 출력할 떄에 
        // 프론트 컨트롤러는 Content-Type을 설정하는 용도로도 사용한다.
        // 
        // 
        
        
        return "Exam06_1.m2() ==> 012ABCabc#!@가각간";
    }
    
    /* 실행 url M1의 실행 URL 주소 : http://localhost:8888/bitcamp-spring-webmvc/mvc/exam06_2/m1
     *        M2의 실행 URL 주소 : http://localhost:8888/bitcamp-spring-webmvc/mvc/exam06_1/m2
     *        
     *        
     *   M1의 실행 결과 : Exam06_1.m1() ==> 012ABCabc#!@???     한글이 깨진다.
     *   M2의 실행 결과 : Exam06_1.m2() ==> 012ABCabc#!@가각간     한글이 안깨진다. 이유 : UTF-8로 지정하였기 때문에
     */
    
    
    
    
}







