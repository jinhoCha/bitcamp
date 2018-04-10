// 예외 처리 - 상황을 호출자에게 알려주기


package step21.ex3;

public class Exam02_1 {

    //static void m() {
        // throw 명령어를 사용하여 예외 정보를 호출자에게 던진다.
        // => throw [java.lang.Throwable 타입의 객체];

        // java.lang.Throwable
        //  =>Throwable에는 두분류의 서브 클래스가 있다.
        // Error
        // => JVM에서 발생된 오류이다.
        // 1)
     //   throw new RuntimeException("예외가 발생했습니다!");
   // }

    static void m() throws Throwable {
        throw new Throwable();
    }
    static void m2() {
        throw new Error();  // OK
    }
    
    static void m3() {
        throw new Error();
    }
    static void m4() throws Exception {
        throw new Exception();
    }
    static void m5() throws Exception{
     //   throw new String(); //컴파일 오류
        //throw 로 던질 수 있는 객체는 오직 java.lang.Thowable 타입만 가능하다.
    }
    public static void main(String[] args) {

        

    }

}
