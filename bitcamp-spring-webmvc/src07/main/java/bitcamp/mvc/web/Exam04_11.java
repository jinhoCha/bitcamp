// RequestMapping - HTTP 파라미터로 메서드 구분하기 

package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam04_11") 
public class Exam04_11 {
    

    // 파라미터값의 존재 여부에 따라 메서드를 구분할 수 있다.
    // 테스트 방법: 
    // 예 1)                 mvc/exam04_1/m1?name=aaa
    @GetMapping(value= "m1", params ="name") 
    @ResponseBody 
    public String m1() {
        return "Exam04_11.m1()";   
    }  
    
 // 예 2) 파라미터를 주지않을경우 = mvc/exam04_1/m1?age=20
    @GetMapping(value= "m2", params ="age") 
    @ResponseBody 
    public String m2() {
        return "Exam04_11.m2()";   
    }  
    
 // 예 3)                 mvc/exam04_1/m1?name=aaa&age=20 같이 비교할경우 
    @GetMapping(value= "m3", params = {"name","age"}) 
    @ResponseBody 
    public String m3() {
        return "Exam04_11.m3()";   
    }  
    // 실행 url주소 http://localhost:8888/bitcamp-spring-webmvc/exam03_1.html
       /* 실행 결과 : 
        * http://localhost:8888/bitcamp-spring-webmvc/mvc/exam04_1/m1?name=aaa    ===> 실행결과 :  Exam04_11.m1()
        * http://localhost:8888/bitcamp-spring-webmvc/mvc/exam04_1/m1?age=20      ===> 실행결과 : 오류     이유 : age는 m2로 지정해서
        * http://localhost:8888/bitcamp-spring-webmvc/mvc/exam04_1/m2?age=20      ===> 실행결과 : Exam04_11.m2()
        * http://localhost:8888/bitcamp-spring-webmvc/mvc/exam04_1/m3?name=aaa&age=20  실행결과 : Exam04_11.m3()
    */
  
}
