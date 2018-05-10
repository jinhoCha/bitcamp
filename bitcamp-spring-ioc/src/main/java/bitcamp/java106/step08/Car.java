package bitcamp.java106.step08;

import java.sql.Date;

public class Car {
    String model;
    String maker;
    Date createdDate;
    boolean auto;
    int cc;
    Engine engine;
    
    public Car() {
        System.out.println("Car()");  // 생성사자가 호출될때 Car문구를 뛰움
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
        System.out.println("Car.setModel()");  
        this.model = model;
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        System.out.println("Car.setMaker()");  
        this.maker = maker;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        System.out.println("Car.CreatedDate()");  
    }
    public boolean isAuto() {
        return auto;
    }
    public void setAuto(boolean auto) {
        this.auto = auto;
        System.out.println("Car.setAuto()"); 
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
        System.out.println("Car.cc()"); 
    }

}
