package com.docform.docform.services;

import java.util.List;
import java.util.Optional;

import com.docform.docform.model.EmailModel;

public interface EmailService {
	
	List<EmailModel>findAllEmails();
	Optional<EmailModel> findById(Integer id);
	EmailModel saveEmail(EmailModel email);
	EmailModel UpdateEmail(EmailModel email);
	void deleteEmail(Integer id);

}