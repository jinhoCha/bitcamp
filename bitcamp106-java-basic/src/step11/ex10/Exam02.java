
// 메서드 오버로딩(overloading)  - 정의하는 규칙과 사용 규칙
package step11.ex10;

public class Exam02 {
    public static void main(String[] args) {
        
        System.out.println(Calculator.plus(100, 200));
        System.out.println(Calculator.plus(100.5f, 200.f));
        System.out.println(Calculator.plus("33", "77"));
    }
}
