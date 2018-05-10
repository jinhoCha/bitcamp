package bitcamp.java106.step08;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;



public class Car4 {
    String model;
    String maker;
    Date createdDate;
    boolean auto;
    int cc;
    Engine engine; 
    
    // 만약 실행 중에 의존 객체를 교체하지 않는다면,
    // 임의로 의존 객체를 교체하지 못하도록 final을 붙여라!
    public Car4(final Engine engine) { // 생성자에 추가
        System.out.println("Car4()");  // 생성사자가 호출될때 Car문구를 뛰움
        this.engine = engine;
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
