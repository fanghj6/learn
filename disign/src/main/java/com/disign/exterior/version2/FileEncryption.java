package com.disign.exterior.version2;

import org.springframework.util.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FileEncryption 加密文件
 * @Description TODO
 * @date 2019/9/5  23:46
 **/
public class FileEncryption {

    public String encryption(String content){
        System.out.println("encryption "+content);
        return DigestUtils.md5DigestAsHex(content.getBytes());
    }
}
