package kodlamaio.hrms.mailService;

import org.springframework.stereotype.Service;

@Service
public class MailSendManager {
	public void verificationSend(String email) {
		System.out.println(" verification sent to your email ->" + email);
	}
}
