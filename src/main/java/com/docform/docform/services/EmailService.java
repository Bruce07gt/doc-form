package com.docform.docform.services;

import java.util.List;
import java.util.Optional;

import com.docform.docform.model.Email;

public interface EmailService {
	
	List<Email>findAllEmails();
	Optional<Email> findById(Integer id);
	Email saveEmail(Email email);
	Email UpdateEmail(Email email);
	void deleteEmail(Integer id);

}