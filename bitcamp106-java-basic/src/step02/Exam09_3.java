// 배열 - 배열 래퍼런스와 인스턴스
package step02;
 
public class Exam09_3 {
    public static void main (String[] args){
        //레퍼런스 변수이다.
        // - 메모리의 주소를 담는 변수이다.
        int[] arr1;
         //ew 명령은 메모리를 확보하는 명령이다.
         // - 리턴 값은 확보된 메모리의 시작 주소이다.
        // - 이렇게 값을 저장하기 위해확보된 메모리를 "인스턴스"라고 부른다.
         arr1 = new int[5];  //new로 설정하면 0으로 초기화된다.. 밑에서 설명있음.

         arr1[0] = 100; // arr1에 저장된 주소로 찾아가서 
                        //0번째 항목에 값을 넣어라!
         arr1[1] = 200; // 1번째 항목에 값을 넣어라        

         System.out.println(arr1[0]);
         System.out.println(arr1[1]);
         //단 한번이라도 메모리에 값을 넣지 않은 상태에서
         // 그 메모리의 값을 사용하려 한다면 컴파일 오류가 발생한다.
          //  int a ;
          //  System.out.println[a]; 컴파일오류

          //하지만 new명령으로 확보된 메모리는 자동으로 0값으로 초기화 된다.
          System.out.println(arr1[2]);
          System.out.println(arr1[3]);
          System.out.println(arr1[4]);
        
        }   
}

//래퍼런스란(reference?
// -값이 아닌 메모리에 주소를 담는 변수
//
// 인스턴스(instance)란?
// 값을 저장하고 있는 메모리.