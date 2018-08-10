// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package challenge.service.impl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import challenge.service.MailService;


@Service
public class MailServicelmpl implements MailService {

    private final JavaMailSender javaMailSender;
    
    @Autowired
    public MailServicelmpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    
    @Override
    
    public boolean send(String subject, String text, String from, String to) {
        MimeMessage message = javaMailSender.createMimeMessage();
        
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message,true,"UTF-8");
            helper.setSubject(subject);
            helper.setText(text);
            helper.setFrom(from);
            helper.setTo(to);
            
            javaMailSender.send(message);
            return true;    
        } catch(MessagingException e) {
            e.printStackTrace();
        }return false;
    } 
}




