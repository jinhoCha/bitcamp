// 문자의 리터럴
package step01;
public class Exam07_1 {
    public static void main(String[] args) {
        
        //소스 코드에 10진수가 아닌 16진수가 있다면,
        // 그것은 개발자가 의도적으로 값이 아닌 2진수를 강조하기 위함이다.

        System.out.println(0x41); //출력할때는 10진수로 출력된다.
        // 해당 숫자가 단순한 정수값이 아니라,
        // 문자 코드 값임을 알려주면,
        // JVM은 그 문자의 코드에 해당하는 글자를 폰트파일에서 찾고 출력한다.
        System.out.println((char)0x41); // 아스키코드로 출력
        System.out.println((char)0x61);
        
        //코드값을 모르면 ' '을 사용하라
        System.out.println('A');
        System.out.println('a');
        // 특수 문자를 입력할 수 없는 경우에는
        // 다음과 같이 그 특수 문자의 유니코드 값을 작은 따옴표에 넣어도 된다.
        // 단 코드값 앞에 \ u문자를 붙여야 한다.
        System.out.println('\u3144'); //ㅄ 이출력된다 폰트파일에있어서
        System.out.println((char)0x3144); //똑같이 출력된다
        System.out.println('\u3182'); //ㅇㅅ이 출력된다 폰트파일에 있어서
    }
}