package kg.megacom.fileservice.service;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.core.io.Resource;

public interface FileService {
    String storeFile(MultipartFile file);

    Resource getFileByName(String fileName);
}
