package com.docform.docform.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_EmailModel")
public class Email implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emailId;
	
	private String subject;
	
	@Column(columnDefinition = "TEXT")
	private String message;
	
	@jakarta.validation.constraints.Email
	private String emailSender;


	
	public Email() {
		super();
	}
	
	public Email(Integer emailId, String subject, String message, String emailSender) {
		super();
		this.emailId = emailId;
		this.subject = subject;
		this.message = message;
		this.emailSender = emailSender;

	}


	public Integer getFormId() {
		return emailId;
	}

	public void setFormId(Integer formId) {
		this.emailId = formId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public String getEmailSender() {
		return emailSender;
	}

	public void setEmailSender(String emailSender) {
		this.emailSender = emailSender;
	}


}
