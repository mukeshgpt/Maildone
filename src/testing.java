import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testing {

	public static void main(String str[]){
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	
	MailService mservice=(MailService)ctx.getBean("Mailservice");
System.out.println(".....................");

String sender="mukeshgpt018@gmail.com";//write here sender gmail id  
String receiver="singh.aman.gautam@gmail.com";//write here receiver id  
mservice.setMail(sender, receiver, "Hi","wlcome");  
      
System.out.println("success");  

}
}