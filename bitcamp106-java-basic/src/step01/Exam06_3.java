// 부동소수점 리터럴 - 2진수로 변경된 것을 확인하기
package step01;
public class Exam06_3 {
    static float f = 12.375f;
    public static void main(String[] args) {
        System.out.println(12.375f);
    }
}

//컴파일 한후
//bin에 깔린Exam06_3.class 파일을
// 비쥬얼 코드의 Hexdump 기능을 이용하여
//16진수 코드를 확인해보라!
//중간에 12.375의 2진수 값인 0x41460000을 볼수 있을것이다.