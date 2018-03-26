// 초기화 블럭 - 인스턴스 볼록
package step08; 

public class Exam06_1 {
    static class A {
        int a,b;
        {
            // 아무 이름 없이 선언하는 블록이 " 초기화 블록 " 이다.
            //인스턴스를 생성한 후에 자동으로 실행한다.
            System.out.println("{}1111111");
        }
        A() {
            System.out.println("A()");
        }
        {
        // 초기화 블록을 굳이 나눠서 여러 개 정의 할 필요는 없다
         // 초기화 블록은 여러개 정의할 수 있다.
            // 순서대로 호출된다.
            System.out.println("{}2222222");
            // 이렇게 초기화 블록을 나눠서 여러개 정의하면 코드를 유지보수하기 어렵다
            // 사용할수 있지만 이렇게 하지말라!
            //만약 초기화 블록을 정의한다면 한개만 하라!!!!
        }
    }
    public static void main(String[] args) {

       A obj1 = new A();
       
        
    }
}