
package bitcamp.java106.pms; //src main java는 안쓴다
import java.util.Scanner;
import bitcamp.java106.pms.domain.Team;

//2단계 : 배열 적용
public class App_2_2{
    public static void main(String[]args){
        Scanner keyScan = new Scanner(System.in);

        // 팀 정보를 받을 메모리 준비
        Team[] teams = new Team[100];
       

        System.out.print("팀명? ");
        teams[0].name = keyScan.nextLine();

        System.out.print("설명? ");
        teams[0].description = keyScan.nextLine();

        System.out.print("최대인원? ");
        teams[0].maxQty = keyScan.nextInt();
        keyScan.nextLine(); // 숫자 뒤에 줄바꿈 코드를 읽는다.
                            // 읽고 난 뒤에 아무것도 안하기 때문에 
                            // 일종의 줄바꿈 코드를 제거하는 효과가 있다.

        System.out.print("시작일? ");
        teams[0].startDate = keyScan.nextLine();

        System.out.print("종료일? ");
        teams[0].endDate = keyScan.nextLine();

        System.out.println("-----------------------------");
        System.out.printf("%s, %d명, %s ~ %s\n", 
            teams[0].name, teams[0].maxQty, teams[0].startDate, teams[0].endDate);
    }
}
