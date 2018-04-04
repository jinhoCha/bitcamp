//다중 인터페이스 구현 II

package step14.ex3;

// 클랫느느 여러 개의 규칙을 이행할 수 있다.
// 규칙들 중에서 메서드가 겹칠 수 이ㄸ싸.
// 상관없다.
//B 인터페이스 m2()


public class Exam03 implements B, C, D{

    public void m1() {} // B의 수퍼 인터페이스인 A인터페이스 구현
    public void m2() {} // B 와 D 인터페이스 구현
    public void m3() {} // C의 인터페이스 구현
    public void m4() {} // D의 인터페이스 구현
}
