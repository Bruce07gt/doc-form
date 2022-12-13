package com.docform.docform.services;


import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FileService {
	
	public void uploadFile(MultipartFile file) throws IllegalStateException, IOException {
		file.transferTo(new File("C:/Users/bruci/Downloads/hereFile/" + file.getOriginalFilename()));
	}
	
}
