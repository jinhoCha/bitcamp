// 초기화 블럭 - 인스턴스  블록 초기화 순서
package step08; 

public class Exam06_3 {
        static class A{
            
            // 숫자쓴게 실행순서
            // 3) 생성자 실행
            A() {
                a = 300;
                
            }
            // 2) 인스턴스 블록 실행
            {
                a = 200;
            }
            // 1) 인스턴스 변수 생성 및 할당 연산자 실행 ( 초기화 문장 실행 )
            int a = 100;
        }
    public static void main(String[] args) {

     A obj1 = new A();
     System.out.println(obj1.a); // 결과는 300
        
    }
}