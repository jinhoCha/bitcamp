
//애노테이션 프토퍼티값 추출
package step20.ex5;

public class Exam01 {

    public static void main(String[] args) {
        // 클래스 정보 객체로부터 애노테이션 정보 추출
        Class clazz = MyClass.class;
       MyAnnotation obj = (MyAnnotation)clazz.getAnnotation(MyAnnotation.class);
      
       System.out.println(obj.v1());
       System.out.println(obj.v2());
       System.out.println(obj.v3());
       }
    }


