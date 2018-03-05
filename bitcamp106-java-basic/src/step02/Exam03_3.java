// 변수 - 메모리에 값 저장하기.

package step02;
 
public class Exam03_3 {
    public static void main (String[] args){
        int a; // 할당(배정 연산자 assignment)
        a= 100; // 논리값을 ture , false 두개만 있다. ture는 1 flase 0이다.

        int b;
        b = a; // 왼쪽에이쓴 메모리에 a라는 이름의 메모리에 들어있는 값을 저장한다.

        System.out.println(a);
        System.out.println(b);
    }
}
//변수에 값할당(assignment)
// -메모리에 값을 저장하는것을 말한다.
// 문법
// - 변수명 = 변수 또는 리터럴;
// 용어
// - '=' 왼쪽에 있는 변수를 'l-value'라 부른다.
// = '=' 오른쪽에있는 변수나 리터럴을 'r-value'라 부른다