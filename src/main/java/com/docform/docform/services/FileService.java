package com.docform.docform.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
	public void uploadFile(MultipartFile file) throws IOException;
}
