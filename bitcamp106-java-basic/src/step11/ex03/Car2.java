package step11.ex03;

public class Car2 {
    String model;
    String maker;
    int capacity;
    boolean sunroof;
    boolean auto;
    
    public Car2() {}
    
    public Car2(String model, String maker, int capacity) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;

    }
    
    // 새로 생성자를 추가해야 한다.
    public Car2(String model, String maker, int capacity,boolean sunroof, boolean auto) {
       // 이 클래스의 다른 생성자를 먼저 호출할 수 있따
        // => 이때 this()를 사용한다
        this(model, maker, capacity);
        // this.model =model;
        // this.maker = maker;
        // this.capacity = capacity;
        this.sunroof = sunroof;
        this.auto = auto;
    }
}


