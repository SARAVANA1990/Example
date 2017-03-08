//package mail;
//
//import java.util.*;
//
//import javax.mail.*;
//
//import javax.mail.internet.*;
//
// 
//
//public class MailSend
//
//{
//
//    public static void main(String [] args)
//
//    {   
//
//        String to = "imasaravanakumarp@gmail.com";
//
//        String from = "imasaravanakumarp@gmail.com";
//
//      //  String host = "localhost";
//
// 
//
//     // Recipient's email ID needs to be mentioned.
//      //  String to = "xyz@gmail.com";//change accordingly
//
//        // Sender's email ID needs to be mentioned
//       // String from = "abc@gmail.com";//change accordingly
//        final String username = "imasaravanakumarp@gmail.com";//change accordingly
//        final String password = "fazer3736";//change accordingly
//
//        // Assuming you are sending email through relay.jangosmtp.net
//        String host = "smtp.gmail.com";
//
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.port", "587");
//
//        // Get the Session object.
//        Session session = Session.getInstance(props,
//        new javax.mail.Authenticator() {
//           protected PasswordAuthentication getPasswordAuthentication() {
//              return new PasswordAuthentication(username, password);
//           }
//        });
// 
//
//        try{
//
//            MimeMessage message = new MimeMessage(session);
//
//            message.setFrom(new InternetAddress(from));
//
// 
//
//            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
//
// 
//
//            message.setSubject("My Email Subject");
//
//            message.setText("My Message Body");
//            Transport.send(message);
//
//            System.out.println("Sent successfully!");
//
//        }
//
//        catch (MessagingException ex) {
//
//            ex.printStackTrace();
//
//        }
//
//    }
//
//}
