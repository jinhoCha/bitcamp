package bitcamp.java106.pms;



import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.domain.Team;

public class App1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Team[] teams = new Team[1000];
        int teamIndex = 0;
        
        
        while(true) {
            System.out.printf("명령 >>\n");
            String arr[] =keyScan.nextLine().toLowerCase().split(" ");
            String menu = arr[0];
            String option = null;
            
            if( arr.length == 2) {
                option=arr[1];
            }

            if (menu.toLowerCase().equals("quit")) {
                System.out.println("안녕히 가세요!");
                
                break;
            }
                else if(menu.toLowerCase().equals("help")) {
                    System.out.println("[도움말]");
                    System.out.println("팀 등록 명령 : team/add");
                    System.out.println("팀 조회 명령 : team/list");
                    System.out.println("팀 상세조회 명령 : team/view 팀명");
                    System.out.println("회원 등록 명령 : member/add");
                    System.out.println("회원 조회 명령 : member/list");
                    System.out.println("회원 상세조회 명령 : member/view 아이디");
                    System.out.println("종료 : quit");
                    System.out.println();
                    continue;
                }
                    
                if(menu.equals("team/add")) {
                    System.out.println(" [ 팀정보입력] ");
                    Team team = new Team();
                    
                    System.out.print("팀명? ");
                    team.name = keyScan.nextLine();

                    System.out.print("설명? ");
                    team.description = keyScan.nextLine();

                    System.out.print("최대인원? ");
                    team.maxQty = keyScan.nextInt();
                    keyScan.nextLine(); 

                    System.out.print("시작일? ");
                    team.startDate = Date.valueOf(keyScan.nextLine());

                    System.out.print("종료일? ");
                    team.endDate = Date.valueOf(keyScan.nextLine());
                   
                    teams[teamIndex ++] = team;
                    continue;
                    
                }
            
                else if(menu.toLowerCase().equals("team/list")) {
                    System.out.println(" 팀 목록 ");
                    for(int i =0; i < teamIndex; i++) {
                        System.out.printf("%s %s %d %s ~ %s\n",teams[i].name,
                                teams[i].description,teams[i].maxQty,
                                teams[i].startDate,teams[i].endDate);
                        continue;
                    }
                }
                    else if(menu.toLowerCase().equals("team/view")) {
                        System.out.printf("팀 정보 조회");
                        if(option == null) {
                            System.out.println("팀명을 입력해주세요");
                            System.out.println();
                            continue;
                        }
                        
                        Team team = null;
                        for(int i =0; i< teamIndex; i++) {
                            if(option.equals(teams[i].name.toLowerCase())) {
                                team = teams[i];
                                break;
                            }
                        }
                    
                        
                            if (team == null) {
                            System.out.println("해당 이름의 팀이 없습니다.");
                    
                        }   
                            else {
                                System.out.printf("팀명: %s\n", team.name);
                                System.out.printf("설명: %s\n", team.description);
                                System.out.printf("최대인원: %d\n", team.maxQty);
                                System.out.printf("기간: %s ~ %s\n", 
                                    team.startDate, team.endDate);
                            }
                        }
                    }
    }


                
                    
            
                
        
    
}
// ver 15 - TeamDao와 MemberDao 객체 생성. 
//          팀 멤버를 다루는 메뉴 추가.