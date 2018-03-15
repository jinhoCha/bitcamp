
package bitcamp.java106.pms; //src main java는 안쓴다
import java.util.Scanner;

import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;
    
public class App002 {
    public static void main(String args[]){
    
     Scanner keyScan = new Scanner(System.in);
        Team teams[] = new Team[1000];
        int teamIndex = 0;
        int memberIndex = 0;
        Member members[] = new Member[1000];
   while(true){
        System.out.print("명령 >");
        String arr[] = keyScan.nextLine().toLowerCase().split(" ");
        String menu = arr[0];
        String option = null;
        if(arr.length == 2 ){
            option = arr[1];
                }

       if(menu.toLowerCase().equals("quit")){
        System.out.println("수고하세요");
        break;
       }   
       else if(menu.toLowerCase().equals("help")){
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
       
       else if(menu.toLowerCase().equals("team/add")){
           
        Team team = new Team();
        System.out.print("팀명 ?");
        team.name = keyScan.nextLine();
        System.out.print("설명 ?");
        team.description = keyScan.nextLine();
        System.out.print("최대인원 ?");
        team.maxQty = keyScan.nextInt();
        keyScan.nextLine();
         System.out.print("시작일 ?");
         team.startDate = keyScan.nextLine();
        System.out.print("종료일 ?");
        team.endDate = keyScan.nextLine();

        teams[teamIndex++] = team;
           continue;
       }
       
       else if (menu.equals("team/list")){
        System.out.println("[팀목록]");
    for(int i = 0; i < teamIndex; i++){
         System.out.printf("%s  %d %s ~ %s \n",teams[i].name,
          teams[i].maxQty, teams[i].startDate, teams[i].endDate);
         
    }

    System.out.println();
    continue;
}   
       else if (menu.equals("team/view")){


        System.out.println("팀 정보조회");
        if (option == null)
 {
         System.out.println("팀 정보조회 입력값이 없습니다.");
 }
         for (int i =0; i< teamIndex; i++){
                if(option.equals(teams[i].name)){
                 System.out.printf("팀명: %s\n", teams[i].name);
                        System.out.printf("설명: %s\n", teams[i].description);
                        System.out.printf("최대인원: %d\n", teams[i].maxQty);
                        System.out.printf("기간: %s ~ %s\n", 
                            teams[i].startDate, teams[i].endDate);
        }
    }
}

    else if (menu.equals("member/add")){
        System.out.println("맴버 입력");
        Member member = new Member();

        System.out.print("아이디를 입력하세요?");
        member.id = keyScan.nextLine();
        System.out.print("이메일를 입력하세요?");
        member.email = keyScan.nextLine();
        System.out.print("비밀번호를 입력하세요?");
        member.password = keyScan.nextLine();

        members[memberIndex++] = member;
    }

    else if (menu.equals("member/list")){
        for(int i=0; i< memberIndex; i++){
            System.out.printf("%s , %s , %s\n",members[i].id, members[i].email,members[i].password);
            
        }
        
    }
    else if (menu.equals("member/view")){
        System.out.println("회원 정보 조회");
        if(option == null){
            System.out.println("아이디를 입력해주세요");
        }
        
        Member member = null;
        for( int i = 0; i < memberIndex; i++){
            if(option.equals(members[i].id.toLowerCase())){
                member = members[i];
                break;
            }
        }
        if(member == null){
            System.out.println("해당 아이디 회원이업습니다.");
        }
        else {
            System.out.printf("아이디 %s\n ", member.id);
            System.out.printf("이메일 %s \n", member.email);
            System.out.printf("비밀번호 %s \n", member.password);
        }
     } else {
         System.out.println("명령어가 올바르지 않습니다.");
     }
    


    

}
    }
}
