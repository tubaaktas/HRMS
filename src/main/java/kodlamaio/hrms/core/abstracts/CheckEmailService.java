package kodlamaio.hrms.core.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface CheckEmailService {
	public boolean mailCheck(String email);
}
