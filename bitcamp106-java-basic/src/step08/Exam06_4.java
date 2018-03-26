// 초기화 블럭 -> 클래스 블록  = 스태틱 블록
package step08; 

public class Exam06_4 {
      public  static class A{
            static int a; // 스태틱변수 a
            static void m() {} // 스태틱 메소드 m
            // 스태틱 블록은 클래스가 로딩된 후에 자동으로 순서대로 실행된다.
            static {
                System.out.println("Static{} 1111111");
            }
           
            static {
                    System.out.println("Static{} 22222222");
            }
    
}
    public static void main(String[] args) throws Exception{

    //클래스가 로딩되는 경우
        
        // => 레퍼런스를 선언할 때는 로딩되지 않는다.
        A obj1;
        A obj2;
        // 1) 클래스 멤버를 최초로 사용할 때 
        //A.a = 100;
        System.out.println("----------------------------"); // 어디서 출력되는지 확인할려고 만듬
       // A.m(); // 두번은 실행안된다. 애를실행해도 같은값이 나온다.
        System.out.println("****************************");
        // 2) 해당 클래스의 인스턴스를  최초로 생성할 떄 
        
        //      인스턴스를 만드려면 설계도가 있어야 하고,
        //      설계도는 메모리에 로딩되어 있어야 한다.
        //      따라서 설계도가 없으면 즉시 설계도를 로딩할 것이다.
        new A();  //위에서 로딩하면 값이 출력안댐
        
        System.out.println("==============================");
        
        // 3) java에서 제공하는 도구를 사용하여 강제로 클래스를 로딩시킬떄 main쪽에다가 throws Exception을 쳐야된다.
        // => 이미 클래스가 로딩되어 있따면 다시 로딩하지 않는다.
        // => 자바는 중복해서 클래스를 메모리에 로딩하지 않는다. 메모리 절약!
        Class.forName("step08.Exam06_4$A");
    }
}