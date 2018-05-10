// 프로퍼티 에디터 만들기.

package bitcamp.java106.step07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

   
public class CustomEngineEditor extends PropertyEditorSupport{
    // 이메서드는 스프링 IoC 컨테이너가 String 타입의 프로퍼티 값을 
    // 다른타입으로 값으로 바꿀때 호출하는 메서드이다.
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("CustomEngineEditor.setAsText");
        String[] values = text.split(",");
        Engine engine = new Engine();
        engine.setMaker(values[0]);
        engine.setValve(Integer.parseInt(values[1]));
        engine.setCylinder(Integer.parseInt(values[2]));
        
     
        this.setValue(engine);
    }
    
}








