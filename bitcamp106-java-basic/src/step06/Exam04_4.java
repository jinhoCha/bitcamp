// 메서드 : 스택 메모리 응용 I
package step06;
import java.util.Scanner;


public class Exam04_4 {
 
    static int m1(int value){  // 5가 들어감
         int r1 = m2(value);
         int r2 = m3(value);
         return r1 + r2;
    }

    static int m2(int value){
         return value + 100;   // value는 5가들어감   5 + 100 = 105 
         
    }

    static int m3(int value){
        return value + 200;
    }

    public static void main(String[] args){
        
        int r = m1(5);  // 결국 310을 리턴함
        System.out.println(r);
        }
    }

 //1 ) main() 호출
    // - >  JVM Stack : args, ref 변수 생성
    //2 ) getArray() 호출
    // = > JVM Stack: ref 변수 생성
    // = > new 명령을 통해서 Heap: new MyObject 인스턴스 생성
    //3 ) getMyObject()호출 끝
    // => JVM Stack: getMyObject() 관련 메모리(ref 변수) 제거
    // => getMyObject() 주소 리턴
    //4 ) main() 호출 끝
    // => JVM Stack : main() 관련 메모리 제거
    //5 ) JVM 종료
    // => JVM이 사용한 모든 메모리(Method Area, JVM Stack. Heap, 등)를 os에 반납..
    
   
    