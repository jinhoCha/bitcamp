// 의존 객체 주입 자동화하기 - 필수의존객체와 선택 의존 객체

package bitcamp.java106.step08;

import java.sql.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Car7 {
    String model;
    String maker;
    Date createdDate;
    boolean auto;
    int cc;
    
  // 이 에노테이션은 자바에서 제공한다. 스프링에서 제공하는것이 아니다!!
  @Resource(name="e1")
   Engine engine;
    
    @Override
    public String toString() {
        return "Car [model=" + model + ", maker=" + maker + ", createdDate=" + createdDate + ", auto=" + auto + ", cc="
                + cc + ", engine=" + engine + "]";
    }

    public Engine getEngine() {
        return engine;
    }
    
    
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Car.setEngine()");
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public boolean isAuto() {
        return auto;
    }
    public void setAuto(boolean auto) {
        this.auto = auto;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }

}
