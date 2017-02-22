package com.huihui.test;

import com.huihui.common.utils.FtpUtil;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 测试Nginx服务器和FTP上传
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-20 4:05
 */
public class TestNginx {

    /**
     * 测试ftp上传工具类
     * @throws FileNotFoundException
     */
    @Test
    public void testFTP() throws FileNotFoundException {
        FtpUtil.uploadFile("imageServer", 21, "ftpuser", "ftpuser", "/home/ftpuser/www/images", "2016/11/20", "1.jpg", new FileInputStream(new File("C:\\Users\\daihui\\Pictures\\捕获.PNG")));
    }

    /**
     * 测试ftp下载工具类
     * @throws FileNotFoundException
     */
    @Test
    public void testDownloadFile(){
        FtpUtil.downloadFile("imageServer",21,"ftpuser", "ftpuser","/home/ftpuser/www/images/2016/11/20","1.jpg","D:");
    }
}
