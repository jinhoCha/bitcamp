
//기존의 클래스를 손대지않고 새기능만 추가한다.
// 상속 문법을 이용한다.
package step11.ex04;


//상속
// => 재사용할 기존 클래스를 지정한다.
// => 새 클래스에는 추가할 기능을 덧붙인다.
public class sedan extends step11.ex01.Car {
    // 인스턴스 변수 추가
    
    boolean sunroof;
    boolean auto;
    
    public sedan(String model, String maker, int capacity, boolean sunroof, boolean auto) {
     
            this.model = model;
            this.maker = maker;
            this.capacity = capacity;
            this.sunroof = sunroof;
            this.auto = auto;
    }
    

}
