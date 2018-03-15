//흐름제어문 - for 반복문의 배열

package step05;
import java.util.Scanner;
import java.util.ArrayList;

public class Exam04_3 {

    public static void main (String[] args){
    String[] names = {"홍길동",  "임꺽정", "유관순", "윤봉길", "안중근"};

    for (int i = 0; i< names.length; i++)
    System.out.println(names[i]);

    System.out.println("----------------------------");

    for ( String name : names) // for ( A : B) --=> B에들어있는값을 A에넣는다
    System.out.println(name);



    }
  }