// 정수 변수.

package step02;
 
public class Exam04_1 {
    public static void main (String[] args){
        
        byte b; // 정수 리터럴은 기본이 4바이트 메모리를 차지한다.
        b = -128;
        System.out.println(b);
        b = 127;
        System.out.println(b);
        // b = -129; 컴파일 오류!
        //System.out.println(b);

        short s;
        s = -32768;
        System.out.println(s);
        s =32767;
        System.out.println(s);

        //s = -32769; 컴파일오류
        //s = 32768; 컴파일오류

        int i;
        i = -2147483648;
        System.out.println(i);
        i = 2147483647;
        System.out.println(i);

        //i = -2147483649; 이 예제는 4바이트 크기를 넘어가는 수를 표기했기 때문에 오류가발생했다.
        //표현할때는 i = -2147483649; 에 숫자뒤에 소문자l 또는 대문자 L을 붙여야한다 
        // i = -2147483649L; 을붙여도 8바이트값을 int인 4바이트값을 집어넣을수가 없다. int에 long값을 못넣는다.

        long l;
        l = -9223372036854775808L;
        System.out.println(l);
        l = 9223372036854775807L;
        System.out.println(l);

        byte b2;
        b2 = 100; // OK
        b2 = 100L; //?
    }
}

