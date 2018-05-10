package bitcamp.java106.step11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        basePackages="bitcamp.java106.step11",
        excludeFilters=@ComponentScan.Filter(
                type=FilterType.REGEX,
                pattern="bitcamp.java106.step11.b.*")
        // step10와 달리 @ComponentScan애노테이션을 통해서도 bitcamp.java106.step11.b패키지를 제거할수있다
        )
public class AppConfig01 {
    
       @Bean 
       public Car Car2() {
       Car c = new Car(null); 
       c.setMaker("비트자동차");
       c.setModel("티코");
       c.setCc(890);
       c.setAuto(true);
       return c;
   }
}
