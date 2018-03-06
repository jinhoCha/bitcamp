// 배열 - 배열 래퍼런스와 인스턴스의 관계
// 부제 : 가비지와 가비지컬렉터
package step02;
 
public class Exam09_4 {
    public static void main (String[] args){
       
        int[] arr1;
         
         arr1 = new int[]{100, 200 ,300};

         System.out.println(arr1[0]);
         System.out.println(arr1[1]);
         System.out.println(arr1[2]);
         //새로운 int 배열을 확보하여 arr1 래퍼런스에 그 주소를 저장한다.
         // => 그러면 이전 배열의 주소는 잃어 버린다.
         // => 주소를 잃어버린 배열은 사용할수 없다.
         // => 이렇게 사용할 수없는 메모리(인스턴스)를 가비지(garbage)라 부른다.
         

         arr1 = new int[]{10, 20, 30 , 40 ,50};
         System.out.println(arr1[0]);
         System.out.println(arr1[1]);
         System.out.println(arr1[2]);
         System.out.println(arr1[3]);
         System.out.println(arr1[4]);
         
        }   
}
// 가비지?
// => 가비지는 개발자가 임의로 제거할 수 없다.
// 주소를 잃어버려 사용할 수 없는 메모리(인스턴스)
// -JVM을 종료하면 어차피 OS에게 사용한 메모리를 반납해야되기 때문이다.
// 자동으로 해제댄다.
// 그러나 JVM이 실행하는 도중에는 개발자가 임의로 해제할수 없다.
// - 오직 가비지 컬렉터만이 가비지 해제할수있다.

// 가비지컬렉터?
// -인스턴스의 주소를 알고 있는 변수가 없을 경우
// 그 인스턴스는 가비지로 간주된다.
// 가비지 메모리를 재사용 할수 있도록 해제시키는 경우는 ???????????????????
// 다음에 경우에 가비지 컬렉터가 실행되어 가비지들이 해제된다.

// 가비지 컬렉터의 실행
//- 1)메모리가 부족할 경우 - OS에게 메모리를 요청하기전에 먼저 가비지들을 청소하고 요청할지말지 결정한다.
// -2)CPU가 한가할 때 - 24시간, 365일 내내 멈춤없이 JVM 실행될 경우 CPU가 한가한 시간에 가비지를 청소
 //    시간을 지정하거나 예측할수는 없다.
 // 3) 개발자가 가비지 컬렉터를 실행해달라고 요청할경우
 // -요청 : 명령을 내린다고 즉시 실행되는것은 아니다.
 //

 // 가바지는 가비지컬렉터가 조건에 따라 실행하니 개발자는 신경 ㄴㄴ
 //
 //가비지 컬렉션 방식의 문제점?
 // - 가비지 컬렉터가 실행되기 전까지는 일정 시간 쓰레기가 메모리가 유지된다.
 // - 메모리 사용률을 극한으로 끌어 올릴 수 없다.
 //

