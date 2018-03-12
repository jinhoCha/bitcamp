
package main.java.bitcamp.java106.pms; //src main java는 안쓴다
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str1 = "";

        while( !command.toLowecase().equals("quit")) {
            System.out.printf("명령 > ");
             str1 = sc.nextLine();
        if(str1.toLowerCase().equals("help" )){
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상제 조회 : team/view 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세 조회명령 : member/view 아이디");
        System.out.println("종료 => quit");
        }
        else{
            System.out.println("잘못 입력하셨습니다.");
            continue;
        }
    
    }
}
      
}
    


private void add(){     // 값을 더하는 인스턴스 메서드
        // Member 객체를 생성합니다.

        Scanner keyScan = new Scanner(System.in);

        // 팀 정보를 받을 메모리 준비
        Team[] teams = new Team[100];
        
        int count = 0;
        for(int i =0; i<3; i++){
            teams[i] = new Team(); // 방만든다 
            
        System.out.print("팀명? ");
        teams[i].name = keyScan.nextLine();

        System.out.print("설명? ");
        teams[i].description = keyScan.nextLine();

        System.out.print("최대인원? ");
        teams[i].maxQty = keyScan.nextInt();
        keyScan.nextLine(); // 숫자 뒤에 줄바꿈 코드를 읽는다.
                            // 읽고 난 뒤에 아무것도 안하기 때문에 
                            // 일종의 줄바꿈 코드를 제거하는 효과가 있다.

        System.out.print("시작일? ");
        teams[i].startDate = keyScan.nextLine();

        System.out.print("종료일? ");
        teams[i].endDate = keyScan.nextLine();
        count++;
            // if(count == teams.length) { // if (i== teams. length -1) }

        System.out.print("계속 하시겠습니까 ? ( Y / N ) ");
       
        String str = keyScan.nextLine();
        if (str.toLowerCase().equals("n" )) {  // toLowerCas 소문자비교
            break;
        } 
    }
        System.out.println("-----------------------------");
        for( int i = 0; i < count; i++){
        System.out.printf("%s, %d명, %s ~ %s\n", 
            teams[i].name, teams[i].maxQty, teams[i].startDate, teams[i].endDate);
    }
}
}