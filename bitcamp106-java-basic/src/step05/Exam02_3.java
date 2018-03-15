//흐름제어문 swich 사용후

package step05;


import java.util.Scanner;


public class Exam02_3 {
    public static void main (String[] args){
        //swich (값 ){}
        // 값으로 가능한 데이터 타입은?
        //정수(byte,short,int,char), 문자열, 특별한 상수Enum 타입 주의주의주의 long은 안댐!!! 
        byte b = 20 ;
        switch(b)  {
            case 1:
            case 2:
            default:
        }

        short s = 20 ;
        switch(s)  {
            case 1:
            case 2:
            default:
        }

        int i = 20 ;
        switch(i)  {
            case 1:
            case 2:
            default:
        }
        char c = 'A' ; //A문자 유니코드값 0x41(65)
        switch(c)  {
            // case 의 값도 int값이면 무엇이든 된다.
            case 'A':
            case 66:
            case 0x43:
            default:


        /* int 정수만 가능합니다
        long l= 2 ;
        switch(l)  {
            case 1:
            case 2:
            default:
        }
        */
        //no 값이 case에 해당되는 경우
        // break 명령을 만날 때까지 아래로 계속 실행된다.
    }

    //string 값을 switch와 casd의 값으로 사용할 수 있다.
    String str = "hello";
    
    switch(str)  {
        // case 의 값도 int값이면 무엇이든 된다.
        case "hello":
        case "오호라":
        case "hull":
        default:

}
/*  boolean 값을 switch와 case에 사용 할 수 없다.
    boolean bool = true;
    switch (bool){
        case true:
        case false:
    }
    */

    int x = 1, y = 300;
    switch (x){
        case 1 * 300:
        // case 1 * y: // 컴파일오류!!!
    }
    }
}