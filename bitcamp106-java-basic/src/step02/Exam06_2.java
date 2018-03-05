// 문자 변수 - UTF-16( 유니코드 2) 코드 값 저장

package step02;
 
public class Exam06_2 {
    public static void main (String[] args){
        
        // 0 ~65535 까지의 UTF-16 코드 값을 저장한다. 2byte 메모리

        char c1,c2;
        c1 = 0x41; // A 문자의 UTF-16코드값 
        c2 = 65; // A문자의 UTF-16 코드값

        //println()은 변수의 타입에 따라 출력을 달리한다.
        // - 변수의 종류가 char이면 출력할떄 10진수로 출력하는 대신
        // 해당 코드의 문자를 찾아 출력한다.
        System.out.println(c1);
        System.out.println(c2);

        // 다음 변수에 핳 문자를 저장하여 출력하라!

        char c3;
        c3 = '헐' ; // 작은 따옴표를 사용하라.
                   // '헐'의 경우 헐 문자의 UTF-16코드 값을
                   // 그자리에 놓는다. 따라서 다음과 같은 코드가 된다.
                   // C4 = 54736;
        int x = (int)c3; // int형으로 형변환해서 보여줌
        System.out.println(x);
    }
}

