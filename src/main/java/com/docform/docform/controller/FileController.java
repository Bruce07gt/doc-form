package com.docform.docform.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.docform.docform.services.FileService;

@RestController
@RequestMapping(value = "/form/file")
public class FileController {
	
	@Autowired
	private FileService fileService;

	@PostMapping
	public void upload(@RequestParam MultipartFile file) throws IllegalStateException, IOException {
		fileService.uploadFile(file);
	}
}
