
package bitcamp.java106.pms; //src main java는 안쓴다
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;

//8단계 team/view 명령을 구현한다.
// 1단계 - 입력 값에서 명령어와 검색어를 구분한다.
// 2단계 - 기능이나 코드가 바뀌면 그에 따라 적절히 변수명도 바뀔 필요가 있다. input을 menu로 싹다바꿈
// 3단계 : 입력값에서 검색어를 별도의 변수로 저장한다.
//4단계 - 팀명이 없으면 안내문구를 출력한다.
//5단계 - 팀명으로 배열을 뒤져서 팀 정보를 찾는다.
//6단계 - 팀명으로 검색할때 대소문자를 구분하지않는다.
//7단계 -  팀명이 일치하는 팀이 없으면 ㅇ나내문구를 출력한다.
//8단계 team/view 명령을 구현한다.
//9단계 - member/add 명령을 구현한다. 회원 정보를 담을 새로운 데이터 타입을 정의한다. => 도메인에 Member.java 작성
//        여러회원 정보를 저장할 레퍼랜스 배열을 준비한다.
public class App10{
    public static void main(String[]args){
        Scanner keyScan = new Scanner(System.in);

            Team[] teams = new Team[1000];
            int teamIndex = 0;

            Member[] members = new Member[1000];  // 래퍼랜스 배열을 준비했다.
            int memberIndex = 0; // 


        while(true) {
        System.out.printf("명령 >");
        String arr[] = keyScan.nextLine().toLowerCase().split(" "); //split(" "); => 공백으로 짤라라 이러면 배열을 리턴함
        String menu = arr[0]; // 짤른 배열(맨앞에있는)을 input에 넣는다
        //입력 받은 문자열을 공백으로 잘라서 명령과 검색어로 구분한다.
        // 일단 다음으로 진행하기 전에 기존에 기능이 잘 되는지 확인하라!!!!
        String option = null; // null의 의미는 주소가 없음을 의미한다.

        if(arr.length == 2) {
            option = arr[1];
        }

        if (menu.toLowerCase().equals("quit")){
            System.out.print("안녕히 가세요!");

            break;
        }

            else if (menu.equals("help")) { 
                 System.out.println("도움말");
                 System.out.println("팀 등록 명령 : team/add");
                 System.out.println("팀 조회 명령 : team/list");
                 System.out.println("팀 상제 조회 : team/view 팀명");
                 System.out.println("회원 등록 명령 : member/add");
                 System.out.println("회원 조회 명령 : member/list");
                 System.out.println("회원 상세 조회명령 : member/view 아이디");
                 System.out.println("종료 => quit");
                

            }
            else if (menu.equals("team/add")){
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
              
            }
                
                else if (menu.equals("team/list")){
                    System.out.println("[팀목록]");
                for(int i = 0; i < teamIndex; i++){
                     System.out.printf("%s  %d %s ~ %s \n",teams[i].name, teams[i].maxQty, teams[i].startDate, teams[i].endDate);
                     
                }

             
            }   else if (menu.equals("team/view")){
                System.out.println("[팀정보 조회]");
                if (option ==null){
                    System.out.println("팀명을 입력하시기 바랍니다");
                    System.out.println();
                    continue;
                }

                else if (menu.equals("member/view")){
                    System.out.println("[회원정보 조회]");
                    if (option ==null){
                        System.out.println("아이디를 입력하시기 바랍니다");
                        System.out.println();
                        continue;
                    }
                    Member member = null;
                    for (int i = 0; i < memberIndex; i++){
                        if (option.equals(members[i].id.toLowerCase())){
                            member = members[i];
                            break;
                        }
                    }
                    if (member==null){
                        System.out.println("해당 아이디의 회원이 없습니다");
                    }
                    else{
                        System.out.printf("아이디 : %s\n", member.id);
                            System.out.printf("이메일: %s\n", member.email);
                            System.out.printf("암호 : %s\n", member.password);
                           
                        }
                    
                    
    
    
                }   
                    


                Team team = null;
                for (int i =0; i< teamIndex; i++){
                    if (option.equals(teams[i].name.toLowerCase())) { // 이름도 소문자로 바꾼뒤 비교한다.
                        team = teams[i];
                        break;  //찾았으니까 break해야댐
                    }

                }

                if (team==null){
                    System.out.println("해당 이름이 없습니다");
                }
                else{
                    System.out.printf("팀명 : %s\n", team.name);
                        System.out.printf("설명 : %s\n", team.description);
                        System.out.printf("최대인원 : %d\n", team.maxQty);
                        System.out.printf("기간 : %s ~ %S\n", team.startDate , team.endDate);
                    }
                
                


            }   

            else if (menu.equals("team/add")){
                System.out.println("[팀 정보 입력]");
                Member member = new Member(); // 팀메모리를 만든다

                System.out.print("아이디? ");
                member.id = keyScan.nextLine();
        
                System.out.print("이메일? ");
                member.email = keyScan.nextLine();
        
                System.out.print("암호? ");
                member.password = keyScan.nextLine();
               
                members[memberIndex++] = member; //팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        
             } else if (menu.equals("member/list")){
                    System.out.println("[회원 목록]");
                for(int i = 0; i < memberIndex; i++){
                     System.out.printf("%s %s %s \n",members[i].id, members[i].email, members[i].password );
                     
                

             
            } 

                
            }
         System.out.println();
        }
}
}
    

