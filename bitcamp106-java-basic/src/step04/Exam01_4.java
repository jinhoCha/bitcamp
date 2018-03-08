//산술 연산자 : 연산의 결과 타입
package step04;

public class Exam01_4 {
public static void main(String[] args) {
    
        int i = 5 ;
        int j = 2 ;
        float r =i/j; //int와  int의 연산 결과는 항상 int이다.
                                    //따라서 r변수에 넣기전에 이미 결과는 2가 된다.
        System.out.println(r);
       

        //해결책 ! 
        // - 변수에 들어 있는 값을 다른 타입으로 바꿔라
        // " 형변환 ( type conversion = type casting)" 하라!

        r = (float)i / (float)j;
        //i / j값은 2.5가 되고 저장되는값도 2.5이다.

        System.out.println(r);
        
        //int와 int의 연산 결과는 int이다.
        int x = Integer.MAX_VALUE;  //0111 1111 1111 1111 1111 1111 1111 1111
        int y = Integer.MAX_VALUE; // OX7FFFFFFF
        int r1 = x + y ; // 0x7fffffff + 0x7fffffff = 0xfffffffe = -2
        long r2 = x + y; // 0x7fffffff + 0x7fffffff = 0xfffffffe = -2    
                                     
       // long r5 = (long)x + (long)y; 

        //int 와 int의 연산 결과는 피연산자와 같은 4바이트 int가 된다.out
        //그래서 8바이트 long 변수에 저장하기 전에 이미 그결과는 int값으로 -2가 되기 때문에 
        //long 변수에 저장될 때는 

        System.out.println(r1);
        System.out.println(r2);
        //System.out.println(r5);

        float f1 = 987.6543f;
        float f2 = 1.111111f;
        float r3 = f1 + f2;       // 987.6543+1.111111 = 988.765411  

        double r4 = f1 + f2;      // 987.6543+1.111111 = 988.765411  

        System.out.println(r3);  // 988.7654
                                 // float과 float의 연산 결과는 float이다.
                                  //그래서 메모리 크기를 넘어가는 뒤에 11은 짤린다.
                                  //짤린값이 r3와 r4에 저장된다.
        System.out.println(r4);  // 988.765380859375
                                // float 값을 double 변수에 저장할 떄 값이 왜곡이 발생한다.
                                // double 변수에 저장할 때 정확하게 저장되지 않는다.
                                // IEEE 754 이진수 변환 문제때문이다.

        double d1 = 987.6543;
        double d2 = 1.111111; 
        double r5 = d1 + d2; //988.7654;
         System.out.println(r5);  //988.7654110000001 맨마지막 1이붙는건 어쩔수가 없다.
    }
}

// int와 int의 연산 결과는 nt이다.
// -float 과 float의 연산 결과는 float이다.
// - 즉 연산 결과는 피연산자의 타입과 같다.
// 그래서 두 값을 계산했을 때 결과 메모리를 초과할경우 는 값이 짤릴 수가있다.

// 코드를 작성할 때 피연산자의 계산 결과가 피연산자의 메모리 크기를 벗어날 가능성이 있다면,
// 처음부터 피연산자의 값을 더 큰 메모리에 담아서 연산을 수행하라!
// int 타입의 메ㅗㅁ리끼리 연산을 수행하면 그결과도 int 타입이 된다.
//즉 연산 결과는 피연산자의 타입과 같다.
//주의 ! 
// 원래 변수의 타입을 바꾸는 것이 아니다.
// 내부적으로 변수에 들어 있는 값을 꺼내 지정된 타입의 임시 메모리를 만들어 저장한다.

//결론 !
// 자바의 최소 연산 단위는 int이다.
// 따라서 int 보다 작은 크기의 메모리 값을 다룰 때는
// 내부적으로 int로 자동 형변환을 수행한 다음에 연산을 수행한다.
// 내부적으로 자동 형변환하는 것을 " 암시적 형변환 ( implicit type)" 이라 부른다.
// byte + byte = int
 // short + short = int
 // byte + short = int
 //

 // 2) 연산 결과는 항상 피연산자의 타입과 같다.
 // => int + int = int
 // => long + long = long
 // => float + float = float
 // => double + double = double
 //
 // 3) 다른 타입과 연산을 수행할 때는
 // 내부적으로 같은 타입으로 맞춘다음에 실행한다.
 // Exam01_5.java를 보라