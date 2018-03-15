//흐름제어문 - for 반복문의 초기화 변수

package step05;
import java.util.ArrayList;
public class Exam04_4 {

    public static void main (String[] args){
    //for ( 변수 선언 및 초기화 ; 조건; 증감문)

    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(3.14f);
    list.add(true);
    list.add(365);
    
    for(int i = 0; i<list.size(); i++)
    System.out.println(list.get(i));

    System.out.println("-----------------------");

    //for 문에 컬렉션도 적용할 수 있다.
    // for ( 변수 선언 : 컬랙션 객체) 문장;

    for (Object value : list)
    System.out.println(value);
    }
  }