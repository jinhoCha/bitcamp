
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
        

        System.out.print("시작일 ?");
        String sday = Sc.nextLine();
        System.out.print("종료일 ?");
        String fday = Sc.nextLine();

        System.out.println();
        System.out.println("팀명 : " +name);
        System.out.println("설명 : " + explain);
        System.out.println("최대인원 = " +number);
        System.out.println("일자 = " +sday +"~"+ fday);

    
    }
}