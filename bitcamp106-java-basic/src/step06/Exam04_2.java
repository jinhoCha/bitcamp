// 메서드 : JVM 메모리 - Heap 메모리 영역
package step06;
import java.util.Scanner;



public class Exam04_2 {
 
    static  int[] getArray(){
                    
        int[] arr = new int[] {100 , 200 , 300}; // 다른거와 달리 new가들어감 그러면 Heap라는 메모리에 저장됨
                                                // Heap에는 100,200,300의 메모리가 저장됨. int메모리여서 4byte의 크기
        return arr;
    }

      
    

    public static void main(String[] args){
       int[] arr;
       arr = getArray(); // int 배열의 주소  
       System.out.println(arr[1]);

        }
    }


    //1 ) main() 호출
    // - >  JVM Stack : args, arr 변수 생성
    //2 ) getArray() 호출
    // = > JVM Stack: arr 변수 생성
    // = > new 명령을 통해서 Heap: new int[] 배열 생성
    //3 ) getArray()호출 끝
    // => JVM Stack: gerArray() 관련 메모리(arr 변수) 제거
    // => new int[]배열 주소 리턴
    //4 ) main() 호출 끝
    // => JVM Stack : main() 관련 메모리 제거
    //5 ) JVM 종료
    // => JVM이 사용한 모든 메모리(Method Area, JVM Stack. Heap, 등)를 os에 반납..
    
   