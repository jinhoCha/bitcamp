package bitcamp.java106.pms.domain; // java 밑에서부터 작성해야댐 아니면 못읽음

import java.sql.Date;

public class Team {  // public 은 modifier : 원래의 특징이나 성질을 변경.
    

        public String name;
        public String description;
        public int maxQty;
        public Date startDate;
        public Date endDate;
        public Member[] members = new Member[10];
        //사용자 정의 데이터 타입에서  메서드 정으리ㅏㄴ?
        
        public int addMember(Member member) {
            for ( int i = 0; i < this.members.length; i++) {
                if (this.members[i] == null) {
              this.members[i] = member;
              System.out.println("추가하였습니다.");
              return 1;
                  
              }
            }
            return 0;
        }
        
        public int deleteMember(String memberId) {
            
        }
        
        public boolean isExist(String memberId) {
            for ( int i = 0; i < this.members.length; i++) {
                if (this.members[i] == null) continue;
              if(this.members[i].id.equals(memberId)){
                  return true;
              }        
            }
            return false;
        }
    }

//ver 15 - 맴버를 저장할 인스턴스 변수를 추가한다