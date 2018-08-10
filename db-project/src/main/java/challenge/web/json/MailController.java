package challenge.web.json;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import challenge.service.MailService;

@Controller
public class MailController {
    
    
    @Autowired
    private MailService mailService;
    
    /*@RequestMapping(value = "/checkMail/", produces = "application/text; charset=utf8")
    @ResponseBody
    private String check(@RequestParam String email) {
        User user = User.findOneByEmail(email);
        return gson.toJson(user);
    }*/
    
    @RequestMapping(value ="/sendMail/", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    private boolean sendMail(HttpSession session, @RequestParam String email){
        int randomCode = new Random().nextInt(10000) + 1000;
        String joinCode = String.valueOf(randomCode);
        session.setAttribute("joinCode", joinCode);
        
        String subject = "회원가입 승인 번호 입니다.";
        StringBuilder sb =new StringBuilder();
        sb.append("회원가입 승인번호는 ").append(joinCode).append("입니다.");
        return mailService.send(subject, sb.toString(), "wlsgh503@naver.com", email);
        
    }
}