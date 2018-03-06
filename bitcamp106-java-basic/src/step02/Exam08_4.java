// 형변환 - 
package step02;
 
public class Exam08_4 {
    public static void main (String[] args){
      float f = 3.14f;
        double d = 9876.56789;

        //부동 소수점 메모리의 값을 정수메모리에 저장 할수 없다. 
        //이유? 무조건 소수점 이하는 제거되기 때문이다.
        // 정수 메모리에 저장한다는 것은 위험이크다.
        //그래서 자바에서는 부동소수점 값을 정수 메모리에 저장하는 것을 문법에서막는다.
      //  int i =f; 컴파일오류
       // long l = d; 컴파일오류


    }
}