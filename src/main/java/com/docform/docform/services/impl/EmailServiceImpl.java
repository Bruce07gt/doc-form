package com.docform.docform.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.docform.docform.model.EmailModel;
import com.docform.docform.repositories.EmailRepository;
import com.docform.docform.services.EmailService;

@Service
public class EmailServiceImpl implements EmailService{

	private final EmailRepository emailRepository;
	
	public EmailServiceImpl(EmailRepository emailResEmailRepository) {
		this.emailRepository = emailResEmailRepository;
	}

	@Override
	public List<EmailModel> findAllEmails() {
		return emailRepository.findAll();
	}

	@Override
	public Optional<EmailModel> findById(Integer id) {
		return emailRepository.findById(id);
	}

	@Override
	public EmailModel saveEmail(EmailModel email) {
		return emailRepository.save(email);
	}

	@Override
	public void deleteEmail(Integer id) {
		emailRepository.deleteById(id);
		
	}

	@Override
	public EmailModel UpdateEmail(EmailModel email) {
		return emailRepository.save(email);
	}


}
