// 형변환 - 명시적 형변환 강제형변환
package step02;
 
public class Exam08_5 {
    public static void main (String[] args){
      float f = 3.14f;
        double d = 9876.56789;

        //부동 소수점 메모리의 값을 정수메모리에 저장 할수 없다. 
        //값이 짤릴수 있음을 알면서도 개발자가 의도적으로
        // 부동소수점 같ㅄ을 정수 메모리에 저장하고싶을떄,/

        //또는 큰메모리에 값을 작은메모리에 저장하고 싶을떄.
        //컴파일러에게 강제로 값을 넣을 것을 명시하라.
        
        int i= (int)f;
        long l= (long)d; // 변수 = (바꾸고자하는타입) 변수 또는 값

        System.out.println(i);
        System.out.println(l);


    }
}