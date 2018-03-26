// 컨트롤러가 작업하는대 필요한 객체를 반드시 준비하도록 생성자를 추가한다.
// => 생성자를 통해 필수 입력 값을 반드시 설정하도록 강제시킬수있다.
// => 즉 생성자란, 객체를 사용하기 전에 유효한 값으로 설정하게 만드는 문법이다.

package bitcamp.java106.pms.controller;
import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.util.Console;

public class BoardController {
    // 스태틱 맴버(변수 및 메서드)를 인스턴스 맴버로 변경한다.
     Scanner keyScan;

         BoardDao boardDao = new BoardDao();
         Board[] boards = new Board[1000];
         int boardIndex = 0;
    
         
         
     public BoardController(Scanner scanner) { //생성자가 호출될때 파라미터에 스캐너를 넣어야댄다.
         // BoardController의 메서드를 이용하려면 반드시 설정해야 하는 값이 있다.
         //Board[] 배열이나 boardIndex 처럼 내부에서 생성하는 값이 있고,
         //Scanner 처럼 외부에서 받아야 하는 값이 있따.
         // 외부에서 반드시 받아야하는 값은 생성자를 통해 입력 받도록 하면 된다.
         this.keyScan = scanner;
     }

    public  void service(String menu, String option) {
        if (menu.equals("board/add")) {
            this.onBoardAdd();
        } else if (menu.equals("board/list")) {
            this.onBoardList();
        } else if (menu.equals("board/view")) {
            this.onBoardView(option);
        } else if (menu.equals("board/update")) {
            this.onBoardUpdate(option);
        } else if (menu.equals("board/delete")) {
            this.onBoardDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

     void onBoardAdd() { // static 메소드는 this가 존재하지않는다. this는 생략가능
        System.out.println("[게시물 입력]");
        Board board = new Board();

        System.out.print("제목? ");
        board.title = this.keyScan.nextLine();

        System.out.print("내용? ");
        board.content = this.keyScan.nextLine();

        System.out.print("등록일? ");
        board.createdDate = Date.valueOf(this.keyScan.nextLine()); //추가했음
        // 기존의 인스턴스값을 다루지않기때문에 파라미터로 작업하기때문에 스태틱 메서드로 선언됬따.

           boardDao.insert(board);
        //this.boards[this.boardIndex++] = board;
    }

     void onBoardList() {
        System.out.println("[게시물 목록]");
        Board[] list = boardDao.list(); // 추가했음 보드 DAO에서 가져옴
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) continue;
            System.out.printf("%d, %s, %s\n",
                i, list[i].title, list[i].createdDate);
           
        }
    }

     void onBoardView(String option) {
        System.out.println("[게시물 조회]");
        if (option == null) {
            System.out.println("번호를 입력하시기 바랍니다.");
            return;
        }
        
       
        
        
        Board board = boardDao.get(Integer.parseInt(option));
        
    
     
     
        if (board ==null) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            
            System.out.printf("팀명: %s\n", board.title);
            System.out.printf("설명: %s\n", board.content);
            System.out.printf("등록일: %s\n", board.createdDate);
        }
    }

     void onBoardUpdate(String option) {
        System.out.println("[게시물 변경]");
        if (option == null) {
            System.out.println("번호를 입력하시기 바랍니다.");
            return;
        }
        int i = Integer.parseInt(option);
        Board board = boardDao.get(i);
        
        if (board == null) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            Board updateBoard = new Board();
            System.out.printf("제목(%s)? ", board.title);
            updateBoard.title = this.keyScan.nextLine();
            System.out.printf("설명(%s)? ", board.content);
            updateBoard.content = this.keyScan.nextLine();
            updateBoard.createdDate = board.createdDate;
            updateBoard.no = board.no;
           boardDao.update( updateBoard);
            System.out.println("변경하였습니다.");
       
    }
     }

     void onBoardDelete(String option) {
        System.out.println("[게시물 삭제]");
        if (option == null) {
            System.out.println("번호를 입력하시기 바랍니다.");
            return; 
        }
        
        int i = Integer.parseInt(option);
        Board board =boardDao.get(i);
        
        if (board == null) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                boardDao.delete(i);
                System.out.println("삭제하였습니다.");
            }
        }
    }
    
}

// ver13 게시물 등록에서 게시물 등록할 때 등록일의 문자열을 Date 객체로 만들어 저장.