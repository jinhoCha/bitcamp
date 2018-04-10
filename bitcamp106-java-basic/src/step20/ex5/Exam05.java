
//애노테이션 프토퍼티값 추출 - 배열값 추출
package step20.ex5;

public class Exam05 {

    public static void main(String[] args) {
        // 클래스 정보 객체로부터 애노테이션 정보 추출
        Class clazz = MyClass5.class;
       MyAnnotation3 obj = (MyAnnotation3)clazz.getAnnotation(MyAnnotation3.class);
      
       System.out.println(obj.v1()[0]); //가나다
       System.out.println(obj.v2()[0]); //100
       System.out.println(obj.v3()[0]); //3.14
       }
    }


