package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author jason
 * @2019/10/11
 */

public interface IFileService {

    String upload(MultipartFile file, String path);

}
