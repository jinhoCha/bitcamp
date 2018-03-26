//기존의 코드를 복사하여 새 클래스에 코드를 추가했다.
// 

package step11.ex02;

public class Car {
    String model;
    String maker;
    int capacity;
    boolean sunroof;
    boolean auto;
    
    public Car() {}
    
    public Car(String model, String maker, int capacity) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;

    }
    
    // 새로 생성자를 추가해야 한다.
    public Car(String model, String maker, int capacity,boolean sunroof, boolean auto) {
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


