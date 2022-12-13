package com.docform.docform.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docform.docform.model.Email;
import com.docform.docform.services.EmailService;

@RestController
@RequestMapping(value = "/form")
public class EmailController {

	@Autowired
    private EmailService emailService;


    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping
    public List<Email> findAllForms() {
    	return emailService.findAllEmails();
    }

    @GetMapping(value = "/{id}")
    public Optional<Email> findById(@PathVariable("id") Integer id) {
    	return emailService.findById(id);
    }
    
    @PostMapping
    public Email saveForm(@RequestBody Email email) {
    	return emailService.saveEmail(email);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteForm(@PathVariable("id") Integer id) {
    	emailService.deleteEmail(id);
    }

}
