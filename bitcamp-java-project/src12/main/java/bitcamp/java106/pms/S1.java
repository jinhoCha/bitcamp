
package main.java.bitcamp.java106.pms; //src main java는 안쓴다
import java.util.Scanner;
import bitcamp.java106.pms.domain.Team;
import java.util.Date;
import java.util.ArrayList;

// ver 1.2 - 명령어를 잘못 입력했을 때 안내 문구를 출력한다. 
// ver 1.1 - member/view 명령을 구현한다.
// ver 1.0 - member/list 명령을 구현한다.
// ver 0.9 - member/add 명령을 구현한다.
// ver 0.8 - team/view 명령을 구현한다.
// ver 0.7 - team/list 명령을 구현한다.
// ver 0.6 - team/add 명령을 구현한다.
// ver 0.5 - help 명령을 구현한다.
// ver 0.4 - quit 명령어 입력 시 반복문을 종료한다.
// ver 0.3 - 사용자로부터 입력 받는 것을 무한 반복한다.
// ver 0.2 - 사용자로부터 입력을 받아 출력한다.
// ver 0.1 - 명령 입력 프롬프트를 출력한다. 

//
public class s1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        // 팀 정보를 받을 메모리 준비
        Team[] teams = new Team[5];
        
        int count = 0;
        for (int i = 0; i < teams.length; i++) {
            count++;
            teams[i] = new Team();

            System.out.print("팀명? ");
            teams[i].name = keyScan.nextLine();

            System.out.print("설명? ");
            teams[i].description = keyScan.nextLine();

            System.out.print("최대인원? ");
            teams[i].maxQty = keyScan.nextInt();
            keyScan.nextLine(); 

            System.out.print("시작일? ");
            teams[i].startDate = keyScan.nextLine();

            System.out.print("종료일? ");
            teams[i].endDate = keyScan.nextLine();

            if (count == teams.length) { // if (i == teams.length - 1)
                break;
            }

            System.out.print("계속하시겠습니까?(Y/n) ");
            String str = keyScan.nextLine();
            if (str.toLowerCase().equals("n")) {
                break;
            } 
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s, %d명, %s ~ %s\n", 
                teams[i].name, teams[i].maxQty, 
                teams[i].startDate, teams[i].endDate);
        }
    }
}

 
 
    