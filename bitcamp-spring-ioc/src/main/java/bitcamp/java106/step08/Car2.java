package bitcamp.java106.step08;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;


// 의존객체 Engine 주입 - 셋터 메서드에 @AutoWired로 표시하라.
public class Car2 {
    String model;
    String maker;
    Date createdDate;
    boolean auto;
    int cc;
    Engine engine;
    
    public Car2() {
        System.out.println("Car2()");  // 생성사자가 호출될때 Car문구를 뛰움
    }
    
    
    @Override
    public String toString() {
        return "Car [model=" + model + ", maker=" + maker + ", createdDate=" + createdDate + ", auto=" + auto + ", cc="
                + cc + ", engine=" + engine + "]";
    }

    public Engine getEngine() {
        return engine;
    }
    
    @Autowired
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
