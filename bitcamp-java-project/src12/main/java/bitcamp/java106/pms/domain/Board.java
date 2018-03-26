package bitcamp.java106.pms.domain; // java 밑에서부터 작성해야댐 아니면 못읽음

import java.sql.Date;

public class Board {  // public 은 modifier : 원래의 특징이나 성질을 변경.
    

        public int no;
        public String title;
        public String content;
        public Date createdDate;
    }

// ver 13 - 등록일의 데이터 타입을 String에서 Date로 바꿈