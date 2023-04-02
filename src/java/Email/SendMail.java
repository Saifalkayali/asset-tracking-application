/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Email;


import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *WebDev.test2018
 * HelloThere1.
 * @author salkayali
 */
public class SendMail {
           public static void sendEmail(String message, String subject) {
    
        try {
            Properties props = new Properties();
            
            props.setProperty("mail.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            Authenticator auth = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("WebDev.test2018", "HelloThere1.");
                }
            };
            Session session = Session.getDefaultInstance(props, auth);
            
            Message msg = new MimeMessage(session);
            
            msg.setSubject(subject);
            msg.setText(message);
            msg.setSentDate(new Date());
            msg.setFrom(new InternetAddress("WebDev.test2018@gmail.com", "IT"));
            msg.setRecipient(Message.RecipientType.TO,new InternetAddress("WebDev.test2018@gmail.com"));
            
            Transport.send(msg);
            
            
            
        } catch (MessagingException | UnsupportedEncodingException ex) {
            try {
                throw new MessagingException("error sending Email", ex);
            } catch (MessagingException ex1) {
                Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
        }
        
}
}