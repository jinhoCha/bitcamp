// 추상 클래스와 추상 메서드 II
package step15.ex1;


public abstract class A4 {
    //추상 클래스의 용도는 서브 클래스들이 가져야할 공통 변수나 메서드를 제공하는 것이다.
    // 그랫 일반 변수나 메서드를 정의할 수 있따.
    
    public static int value1;
    private int value2;
    
    static void m0() {}
    public void m1() {}
    public void m2() {}
    
    
    
    public abstract void m3();
    
    //추상 메서드는 구현할 수 없다.
    // public abstract void m2() {} //컴파일 오류
}
