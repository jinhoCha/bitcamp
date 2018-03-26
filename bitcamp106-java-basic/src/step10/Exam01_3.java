// String - mutable vs immutable 객체

package step10;

public class Exam01_3 {

    public static void main(String[] args) {
            
        //String 객체는 immutable 객체이다.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // 즉 한 번 객체에 값을 담으면 변경할 수 없다.
        
        String s1 = new String("Hello");
        
        //String 클래스에서 제공하는 어떤 메서드를 호출하든지 간에
        // 원래의 데이터를 변경하지 않는다.
        // 다만 새로 String 객체를 만들 뿐이다.
        String s2 = s1.replace("l", "x");  // ㅣ이라는 문자를 x로 바꿔주기
        System.out.printf("%s %s\n", s1, s2); // s1는 Hello출력 s2는 Hexxo를 출력
        
       String s3 = s1.concat(", world!");
       System.out.printf("%s :  %s\n", s1, s3); // s1은 Hello 출력
                                                // s3는 Hello, world! 출력
       
       //StringBuffer는 mutable 객체이다. !!!!!!!!!!!!!!!!!!!!!!!!!!!!
       //원래의 문자열을 변경하고 싶을떄 사용하는 클래스이다.
       StringBuffer buf = new StringBuffer("Hello");
       buf.replace(2, 4, "xx"); // 2번부터 4번까지 문자열을 xx로 바꾼다.
       System.out.println(buf); // Hexxo가 출력됨. 원본이 바뀜
       
       //StringBuffer를 사용할때의 주의사항!!!
       //StringBuffer의 내용물을 비교할 때 equals() 사용해봐야 소용없다.
       // == 연산자와 같은 결과를 출력한다.
       StringBuffer b1 = new StringBuffer("Hello");
       StringBuffer b2 = new StringBuffer("Hello");
       
       if (b1.equals(b2))                       // b1 != b2라고 출력됨.
           System.out.println("b1 == b2");
       else
           System.out.println("b1 != b2");
               
       // 해결책 ? 
       // => StringBuffer에서 String을 꺼내 비교하라 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
       if (b1.toString().equals(b2.toString())) // b1 == b2라고 출력됨. toString은 버퍼에서 스트링을꺼낸다.
           System.out.println("b1 == b2");
       else
           System.out.println("b1 != b2");
       
    }


    

}
