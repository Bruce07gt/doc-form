package com.docform.docform.services.impl;

import com.docform.docform.services.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public void uploadFile(MultipartFile file) throws IllegalStateException, IOException {
                //coloque entre aspas o caminho do diretorio onde irá receber o arquivo.
        file.transferTo(new File("******************" + file.getOriginalFilename()));
    }
}
