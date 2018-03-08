
package step04;

public class Exam01_6 {
public static void main(String[] args) {
    
      byte b1 = (byte)128; // 0000 0000 0000 0000 0000 0000 1000 0000
      //1000 0000 (128)
      //0111 1111 (1의 보수
      //1000 0000 2의보수 = -128
      System.out.println(b1);
      
      byte b2 = (byte)256; // 0000 0000 0000 0000 0000 0001 0000 0000
                          //                3바이트        /  1바이트
                          //4 바이트 중에서 앞의 3바이트 짤린다. 뒤에 1바이트가 저장된다.
      System.out.println(b2); // 0이출력됨 짤려서

    }
}

