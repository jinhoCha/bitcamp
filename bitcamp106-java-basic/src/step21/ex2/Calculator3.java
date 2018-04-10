// 예외 처리 문법을 적용한 후 - 오류일 때  예외 정보를 별도로 호출자에게 전달한다.

package step21.ex2;

public class Calculator3 {
    
    // 이 메서드에서 어떤 예외가 발생할 수 있는지 호출자가 알 수 있도록
    // 메서드 선언부에 명시해야 한다.
    public static int compute(String op, int a, int b)  {
        switch(op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "%": return a % b;
        default:
            //유효하지않은 연산자인 경우 throw 명령을 이용하여 호출자에게
            // 오류상황을 알린다.
            throw new RuntimeException("해당 연산자를 지원하지 않습니다.");
            
            
        }
    }
}
