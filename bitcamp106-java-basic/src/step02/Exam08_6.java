// 형변환 - 명시적 형변환 강제형변환 II두번째
package step02;
 
public class Exam08_6 {
    public static void main (String[] args){
     
        byte b =100;
        short s =100;
        int i = 100;
        long l =100;
        
        // 큰 메모리에 값을 작은 메모리에 저장할 경우
        // => 작은 메모리에 들어갈 수 있는 값인 경우에 형변환을 해야 한다.

        byte b2 = (byte)s;
        System.out.println(b2);

         b2 = (byte)i;
        System.out.println(b2);

        b2 = (byte)l;
        System.out.println(b2);

        int i2 = 0b0001_0010_1100;//300;
        b2 = (byte)i2;
        System.out.println(b2); //앞에 3바이트가짤리고 
                                //0b0010_1100 1바이트가 남아서 44가출력됨.
        // 작은 메모리에 들어갈 값 보다 큰 값을
        // 명시적 형변환을 수행하여 값을 넣으려 하면 값이 짤린다.

       // System.out.println(i);
        //System.out.println(l);


    }
}