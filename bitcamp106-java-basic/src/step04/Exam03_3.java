// 논리 연산자 && vs & 
package step04;

public class Exam03_3 {
public static void main(String[] args) {
    
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    System.out.printf("a= %b, b=%b, r=%b\n",a ,b, r); // a= false, b= false, r= false

    a = false;
    b = false;
    r = a & (b = true);
    System.out.printf("a= %b, b=%b, r=%b\n",a ,b, r); // a= false, b= ture, r= false

   
    }
}

// &&, ||
// -앞의 피연산자의 값으로 결괄르 알 수 있다면 뒤의 명령은 실행하지 않는다.
//
// &, ||
// - 앞의 피연산자로 결과를 알수 있을지라도,
// 뒤에 놓은 명령까지 모두 실행한다.