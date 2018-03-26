// 메서드 : 인스턴스와 Heap 메모리 영역
package step06;
import java.util.Scanner;

class MyObject2{
    int a;
    int b;
    
}


public class Exam04_3 {
 
    static MyObject2 getMyObject2(){
            //Exam03_3.java에 정의된 MyObejct 클래스 사용
       MyObject2 ref = new MyObject2();
       ref.a =100;
       ref.b =200;

    
        return ref;
    }

    public static void main(String[] args){
      MyObject2 ref;
     
       ref = getMyObject2();
       System.out.println(ref.a);
       System.out.println(ref.b);

        }
    }

 //1 ) main() 호출
    // - >  JVM Stack : args, ref 변수 생성
    //2 ) getArray() 호출
    // = > JVM Stack: ref 변수 생성
    // = > new 명령을 통해서 Heap: new MyObject2 클래스 생성
    //
    //3 ) getMyObject2()호출 끝
    // => JVM Stack: getMyObject2() 관련 메모리(ref 변수) 제거
    // => getMyObject2() 주소 리턴
    //4 ) main() 호출 끝
    // => JVM Stack : main() 관련 메모리 제거
    //5 ) JVM 종료
    // => JVM이 사용한 모든 메모리(Method Area, JVM Stack. Heap, 등)를 os에 반납..
    
   
    