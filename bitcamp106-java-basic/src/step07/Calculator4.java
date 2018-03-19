// 메서드 분류 - 인스턴스 메서드 사용

package step07;
//메서드 분류
//=> 관련된 기능을 수행하는 메서드를 한 그룹으로 묶는다.
public class Calculator4 {
    
    
   
     int result = 0;  // 
    
     //인스턴스 변수를 다룰 때는 인스턴스 메서드를 사용하는것이 편하다!
     // 왜?
     // => 파라미터로 따로 인스턴스의 주소를 받을 필요가 없기 때문이다.
    public void plus (int value) {
        //인스턴스 메서드는 인스턴스의 주소를 this라는 내장변수에 자동으로 받는다.
        this.result += value; // result = result + value
        
    }
    public  void minus (int value) {  // static을 지우고 this라는 내장변수 사용
        this.result -= value;
    }
    public  void multiple (int value) {
        this.result *= value;
    }
    public void divide (int value) {
        this.result /= value;
    }
}
