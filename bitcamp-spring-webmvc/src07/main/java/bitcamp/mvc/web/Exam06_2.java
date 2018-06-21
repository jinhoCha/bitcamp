// 요청 핸들러의 파라미터 - 콘텐트를 직접 리턴하기 II
package bitcamp.mvc.web;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@RequestMapping("/exam06_2") 
public class Exam06_2 {
    
    // request handler에서 콘텐트를 직접 리턴할 때는 
    // HttpEntity에 담아서 리턴할 수 있다.
    @GetMapping(value="m1")  
    @ResponseBody  
    public HttpEntity<String> m1() {
        // 마찬가지로 응답 컨텐트의  기본타입은
        // "text/html;charset=ISO-8859-1" 이다.
        HttpEntity<String> entity = new HttpEntity<>("Exam06_2.m1() ==> 012ABCabc#!@가각");
        return entity;
    }
    
    @GetMapping(value="m2")  
    @ResponseBody  
    public HttpEntity<String> m2() {
        // 응답 콘텐트의 타입과 문자표를 지정하고 싶다면
        // 응답헤더를 명시적으로 지정하라!
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        HttpEntity<String> entity = new HttpEntity<>("Exam06_2.m2() ==> 012ABCabc#!@가각",headers);
        return entity;
    }
    
    @GetMapping(value="m3")  
    @ResponseBody  
    public ResponseEntity<String> m3() {
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        // ResponseEntitiy는 HttpEntity의 하위 클래스이다.
        // 응답할 때 상태코드를 설정할 수 있다.
        ResponseEntity<String> entity = new ResponseEntity<>(
                
                "Exam06_2.m3() ==> 012ABCabc#!@가각",
                headers,
                HttpStatus.OK);
        return entity;
    }

    
    /* 실행 url M1의 실행 URL 주소 : http://localhost:8888/bitcamp-spring-webmvc/mvc/exam06_2/m1
     *        M2의 실행 URL 주소 : http://localhost:8888/bitcamp-spring-webmvc/mvc/exam06_2/m2
     *        M3의 실행 URL 주소 : http://localhost:8888/bitcamp-spring-webmvc/mvc/exam06_2/m3
     *        
     *   M1의 실행 결과 : Exam06_2.m1() ==> 012ABCabc#!@??     한글이 깨진다.
     *   M2의 실행 결과 : Exam06_2.m2() ==> 012ABCabc#!@가각     한글이 안깨진다. 이유 : UTF-8로 지정하였기 때문에
         M3의 실행 결과 : Exam06_2.m3() ==> 012ABCabc#!@가각 
     */ 
    
    
    
    
}







