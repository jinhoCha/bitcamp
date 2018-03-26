package step08; // 변수의 초기값

public class Exam05_1 {
    static class A{
        static int a;
        int b;
    }
    public static void main(String[] args) {
        int c;

        System.out.println(A.a);

        A obj1 = new A();
        //인스턴스 변수는 생성되는순간 0으로 자동초기화된다.
        System.out.println(obj1.b);
        
       // System.out.println(c); // 로컬변수는 자동초기화 되지않는다.
                               // 반드시 사용전에 값을 저장해야한다.
                                //컴파일오류 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
}