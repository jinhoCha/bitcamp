package bitcamp.java106.step08;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;


// 의존객체 Engine 주입 - 인스턴스 변수에 @AutoWired를 붙여도 된다.
public class Car3 {
    String model;
    String maker;
    Date createdDate;
    boolean auto;
    int cc;
    @Autowired Engine engine; // 인스턴스 변수 앞에 붙인다.
    
    public Car3() {
        System.out.println("Car3()");  // 생성사자가 호출될때 Car문구를 뛰움
    }
    
    
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
