// 서비스 컴포넌트 - 게시물 관련 업무를 처리할 객체
package challenge.service;

public interface MailService {
    boolean send(String subject, String text, String from, String to);
}