// 의존 객체 주입 자동화하기 - 생성자를 이용하여 의존 객체 주입
package bitcamp.java106.step08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam06 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-06.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        /*
         * @Autowired(required=false)을 붙임으로써 선택사항으로 바꾸고 실행결과값은 
         Car [model=티코, maker=비트자동차, createdDate=null, auto=true, cc=890, engine=null]
                                                                                                                                                                                                   엔진에 null나옴
        */
        
        
        
    }
}





