// 비트 이동 연산자 : 응용 1
package step04;

public class Exam04_4 {
public static void main(String[] args) {
    
    int i = 0x27a130ff;
    int a,b,c,d;

    
    System.out.println(Integer.toHexString(i));
    // i변수에 들어있는 값을 1바이트씩 짤라서 16진수로 출력하라.

    // 27a130ff == 00100111_10100001_00110000_1111_1111
    a = i >> 24 ; // 00000000_00000000_00000000_00100111;
    b = (i >> 16)  & 0xff;
                 //  00000000_00000000_00100111_10100001;
                 //& 00000000_00000000_00000000_11111111; 엔드를써서 1바이트만출력
    c = (i >> 8) & 0xff;
                
    d = i & 0xff;
                //  00000000_00000000_00100111_11111111;
                 //& 00000000_00000000_00000000_11111111; 엔드를써서 1바이트만출력
            
    System.out.println(Integer.toHexString(a)); // 27
    System.out.println(Integer.toHexString(b)); // a1
    System.out.println(Integer.toHexString(c)); // 30
    System.out.println(Integer.toHexString(d)); // ff


}
}

//오른쪽 이동
// - 비트 이동은 곱하기 2 한것과 같은 효과를 준다.