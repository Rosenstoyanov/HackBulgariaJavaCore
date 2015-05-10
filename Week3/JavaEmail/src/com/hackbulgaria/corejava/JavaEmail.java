package com.hackbulgaria.corejava;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class JavaEmail {
	public static void main(String[] args) throws EmailException {

		// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("/home/rosen/Downloads/azbW3zq_460sa_v1.gif");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Picture of Horse");
		attachment.setName("Rosen");

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthentication(User.user, User.pass);
		email.setSSLOnConnect(true);
		email.setFrom("rosen.iv.stoyanov@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("rosen456@abv.bg");

		// MultiPartEmail email = new MultiPartEmail();
		// email.setHostName("mail.myserver.com");
		// email.addTo("jdoe@somewhere.org", "John Doe");
		// email.setFrom("me@apache.org", "Me");
		// email.setSubject("The picture");
		// email.setMsg("Here is the picture you wanted");

		// add the attachment
		email.attach(attachment);

		// send the email
		email.send();

	}

}
