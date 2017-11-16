import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;


public class MailService {

	
private	MailSender mailsender;

public void setMailsender(MailSender mailsender) {
	this.mailsender = mailsender;
}


public void setMail(String Form,String To,String subject,String massage){
	SimpleMailMessage message=new SimpleMailMessage();
	
	message.setFrom(Form);
	message.setTo(To);
	message.setSubject(subject);
	message.setText(massage);
	mailsender.send(message);
}
}
