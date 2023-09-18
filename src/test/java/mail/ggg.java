package mail;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class ggg{
public static void main(String[] args) {

String to="pradeep7725@gmail.com";//change accordingly
final String from="pradeep7725@gmail.com";//change accordingly
final String password="7795257324";//change accordingly

//Get the session object
Properties props = new Properties();
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class",
"javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.port", "465");

Session session = Session.getDefaultInstance(props,
new javax.mail.Authenticator() 
{
protected PasswordAuthentication getPasswordAuthentication() 
{
return new PasswordAuthentication(from,password);
}
});

//compose message
try {
MimeMessage message = new MimeMessage(session);
message.setFrom(new InternetAddress(from));
message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
message.setSubject("Nothing Special..");
message.setText("Send Mail By Java Programmm....");

//send message
Transport.send(message);

System.out.println("message sent successfully");

} catch (MessagingException e) {
	throw new RuntimeException(e);}
     //12333
}
}