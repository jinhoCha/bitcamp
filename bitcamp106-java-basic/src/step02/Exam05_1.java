// 정수 변수.

package step02;
 
public class Exam05_1 {
    public static void main (String[] args){
        
       //유효자릿수 7자리 부동소수점 저장 가능
       float f;

       f = 9.87654f;
       System.out.println(f);

       f = 987654.5f;
       System.out.println(f);

       //유효자릿수는 소수점을 제외한 숫자의 갯수이다.
       //단 앞이나 뒤에 -이 오면 그 0은 자릿수에서 제외한다.
       f = 0.000009876545f;
       System.out.println(f);  //OK 정상적으로 9.876545E-6이 출력됨
                               // 부동소수점 값을 메모리에 저장할 때는
                               // 늘 정확하게 저장되지 않을 수 있다는 사실을 기억해야된다.

       // 다음과 같이 정수를 부동소수점 메모리에 저장하려 할때는 값을 짤릴수 있다.
       // 즉 저장할때 정확하게 저장할 수 없다.  
       // 정수 (int) ==> 부동소수점(float)
       f = 987654500;
       System.out.println(f);
        //결론 - 정수를 부동소수점 메모리에 저장할 때는 특히 주의해야한다.
        // 9.8765453E8이 출력됨.
    }
}

