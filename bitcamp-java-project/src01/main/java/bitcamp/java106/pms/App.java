package bitcamp.java106.pms;

//ver 0.8 - team/view 명령을 구현한다.
// 1단계: 입력 값에서 명령어와 검색어를 구분한다.
// 2단계: 기능이나 코드가 바뀌면 그에 따라 적절히 변수명도 바뀔 필요가 있다.
// 3단계: 입력 값에서 검색어를 별도의 변수에 저장한다.
//ver 0.7 - team/list 명령을 구현한다.
//ver 0.6 - team/add 명령을 구현한다.
//ver 0.5 - help 명령을 구현한다.
//ver 0.4 - quit 명령어 입력 시 반복문을 종료한다.
//ver 0.3 - 사용자로부터 입력 받는 것을 무한 반복한다.
//ver 0.2 - 사용자로부터 입력을 받아 출력한다.
//ver 0.1 - 명령 입력 프롬프트를 출력한다. 
public class App {
public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    Team[] teams = new Team[1000];
    int teamIndex = 0;

    while (true) {
        System.out.print("명령> ");
        String[] arr = keyScan.nextLine().toLowerCase().split(" ");
        String menu = arr[0];
        String option = null; // 문자열 없음!
        if (arr.length == 2) {
            option = arr[1];
        }

        if (menu.equals("quit")) {
            System.out.println("안녕히 가세요!");
            break;
        } else if (menu.equals("help")) {
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
        } else if (menu.equals("team/add")) {
            System.out.println("[팀 정보 입력]");
            Team team = new Team();

            System.out.print("팀명? ");
            team.name = keyScan.nextLine();

            System.out.print("설명? ");
            team.description = keyScan.nextLine();

            System.out.print("최대인원? ");
            team.maxQty = keyScan.nextInt();
            keyScan.nextLine(); 

            System.out.print("시작일? ");
            team.startDate = keyScan.nextLine();

            System.out.print("종료일? ");
            team.endDate = keyScan.nextLine();

            // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
            teams[teamIndex++] = team;

            System.out.println();
            continue;
        } else if (menu.equals("team/list")) {
            System.out.println("[팀 목록]");
            for (int i = 0; i < teamIndex; i++) {
                System.out.printf("%s, %d, %s ~ %s\n", 
                    teams[i].name, teams[i].maxQty, 
                    teams[i].startDate, teams[i].endDate);
            }
            System.out.println();
            continue;
        } else if (menu.equals("team/view")) {
            System.out.println("[팀 정보 조회]");
            System.out.println(option);
        }

        System.out.println(menu);
    }
}
}