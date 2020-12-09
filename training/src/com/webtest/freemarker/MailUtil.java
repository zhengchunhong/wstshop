package com.webtest.freemarker;

import java.io.UnsupportedEncodingException;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil {
//	static int port = 465;
	static String server = "smtp.126.com";
	static String from = "2��-wstshop-ʵѵ";
	static String user = "zheng_chunhong010@126.com";
	static String password = "IUQYAGUCDOCEUVXD";

	public static void sendEmail(String email, String subject, String body) throws UnsupportedEncodingException {
		try {
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
            //�����ʼ��Ự����
            Properties props = new Properties();
            //����ķ��ͷ�������ַ
   
            props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.setProperty("mail.smtp.socketFactory.fallback", "false");
			
			props.put("mail.smtp.host", server);
			props.setProperty("mail.smtp.port", "465");
//			props.put("mail.smtp.port", String.valueOf(port));
			props.put("mail.smtp.socketFactory.port","465");
			props.put("mail.smtp.auth", "true");
			Transport transport = null;
			Session session = Session.getDefaultInstance(props, null);
			transport = session.getTransport("smtp");
			transport.connect(server, user, password);
			MimeMessage msg = new MimeMessage(session);
			msg.setSentDate(new Date());

			InternetAddress fromAddress = new InternetAddress(user, from, "UTF-8");
			msg.setFrom(fromAddress);
			String emailList[] = email.split(",");
			InternetAddress[] toAddress = new InternetAddress[emailList.length];

			for (int i = 0; i < emailList.length; i++) {
				toAddress[i] = new InternetAddress(emailList[i]);
			}
			// msg.setRecipients(Message.RecipientType.TO, toAddress);
			msg.addRecipients(Message.RecipientType.TO, toAddress);
			msg.setSubject(subject, "UTF-8");
			msg.setContent(body, "text/html;charset=utf-8");
			msg.saveChanges();
			transport.sendMessage(msg, msg.getAllRecipients());
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

//	public static void main(String args[]) throws UnsupportedEncodingException {
//		MailUtil.sendEmail("zheng_chunhong010@126.com", "ceshi", "ce");
//	}

}