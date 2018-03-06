
package main.java.bitcamp.java106.pms; //src main java는 안쓴다
import java.util.Scanner;

public class App{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);


        System.out.print("팀명 ?");
        String name = Sc.nextLine();
        

        System.out.print("설명 ?");
        String explain = Sc.nextLine();
       

        System.out.print("최대인원 ?");
        String number = Sc.nextLine();
        //int number = Sc.nextInt(); 이것을 사용하였을경우
        //sc.nextLine(); 숫자뒤에 줄바꿈 코드를 읽는다
                        //일고 난뒤에 아무것도 안하기때문에 일종의 줄바꿈 코드를 제거하는 효과가있다.

        System.out.print("시작일 ?");
        String sday = Sc.nextLine();
        System.out.print("종료일 ?");
        String fday = Sc.nextLine();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("팀명 : " +name);
        System.out.println("설명 : " + explain);
        System.out.println("최대인원 = " +number);
        System.out.println("일자 = " +sday +" ~ "+ fday);

    
    }
}