package com.docform.docform.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.docform.docform.model.Email;
import com.docform.docform.repositories.EmailRepository;
import com.docform.docform.services.EmailService;

@Service
public class EmailServiceImpl implements EmailService{

	private final EmailRepository emailRepository;
	
	public EmailServiceImpl(EmailRepository emailResEmailRepository) {
		this.emailRepository = emailResEmailRepository;
	}

	@Override
	public List<Email> findAllEmails() {
		return emailRepository.findAll();
	}

	@Override
	public Optional<Email> findById(Integer id) {
		return emailRepository.findById(id);
	}

	@Override
	public Email saveEmail(Email email) {
		return emailRepository.save(email);
	}

	@Override
	public void deleteEmail(Integer id) {
		emailRepository.deleteById(id);
		
	}

	@Override
	public Email UpdateEmail(Email email) {
		return emailRepository.save(email);
	}


}
