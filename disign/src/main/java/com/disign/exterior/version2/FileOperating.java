package com.disign.exterior.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FileOperating 具体外观类
 * @Description TODO
 * @date 2019/9/5  23:44
 **/
public class FileOperating implements  AbstractFileOperating{

    private FileRead fileRead;

    private FileWrite fileWrite;

    private FileEncryption fileEncryption;

    public FileOperating() {
        this.fileRead = new FileRead();
        this.fileWrite = new FileWrite();
        this.fileEncryption = new FileEncryption();
    }

    @Override
    public void FileOperating(String src,String des) {
        String content = fileRead.read(src);
        content = fileEncryption.encryption(content);
        fileWrite.write(content,des);

    }
}
