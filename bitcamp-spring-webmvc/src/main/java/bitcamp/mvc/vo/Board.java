package bitcamp.mvc.vo;

import java.sql.Date;

public class Board {
    int no;
    String title;
    String context;
    Date createdDate;
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
    
}
