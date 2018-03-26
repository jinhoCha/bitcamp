
package bitcamp.java106.pms; //src main java는 안쓴다
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import bitcamp.java106.pms.domain.Team;

//6단계 team/list 명령을 구현한다.
public class App06{
    public static void main(String[]args){
        Scanner keyScan = new Scanner(System.in);

            Team[] teams = new Team[1000];
            int teamIndex = 0;

        while(true) {
        System.out.printf("명령 >");
        String input = keyScan.nextLine().toLowerCase();

        if (input.toLowerCase().equals("quit")){
            System.out.print("안녕히 가세요!");

            break;
        }

            else if (input.equals("help")) { 
                 System.out.println("도움말");
                 System.out.println("팀 등록 명령 : team/add");
                 System.out.println("팀 조회 명령 : team/list");
                 System.out.println("팀 상제 조회 : team/view 팀명");
                 System.out.println("회원 등록 명령 : member/add");
                 System.out.println("회원 조회 명령 : member/list");
                 System.out.println("회원 상세 조회명령 : member/view 아이디");
                 System.out.println("종료 => quit");
                 System.out.println();
                 continue;

            }
            else if (input.equals("team/add")){
                System.out.println("[팀 정보 입력]");
                Team team = new Team(); // 팀메모리를 만든다

                System.out.print("팀명? ");
                team.name = keyScan.nextLine();
        
                System.out.print("설명? ");
                team.description = keyScan.nextLine();
        
                System.out.print("최대인원? ");
                team.maxQty = keyScan.nextInt();
                keyScan.nextLine(); // 숫자 뒤에 줄바꿈 코드를 읽는다.
                                    // 읽고 난 뒤에 아무것도 안하기 때문에 
                                    // 일종의 줄바꿈 코드를 제거하는 효과가 있다.
        
                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();
        
                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();

                teams[teamIndex++] = team; //팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        
                

               // System.out.printf("%s %s %d %s %s \n",team.name, team.description, team.maxQty, team.startDate, team.endDate);
               // System.out.println();
                continue;
            }
                
                else if (input.equals("team/list")){
                    System.out.println("[팀목록]");
                for(int i = 0; i < teamIndex; i++){
                     System.out.printf("%s  %d %s ~ %s \n",teams[i].name, teams[i].maxQty, teams[i].startDate, teams[i].endDate);
                     
                }

                System.out.println();
                continue;
            }
         System.out.print(input);
        }
}
}
    

