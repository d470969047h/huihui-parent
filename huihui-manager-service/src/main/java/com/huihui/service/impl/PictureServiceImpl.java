package com.huihui.service.impl;

import com.huihui.common.utils.FtpUtil;
import com.huihui.common.utils.IDUtils;
import com.huihui.common.utils.PictureResult;
import com.huihui.service.IPictureService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片上传
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-20 17:46
 */
@Service
public class PictureServiceImpl implements IPictureService {


    @Value("${IMAGE_BASE_URL}")
    private String IMAGE_BASE_URL;
    @Value("${FILI_UPLOAD_PATH}")
    private String FILI_UPLOAD_PATH;
    @Value("${FTP_SERVER_IP}")
    private String FTP_SERVER_IP;
    @Value("${FTP_SERVER_PORT}")
    private Integer FTP_SERVER_PORT;
    @Value("${FTP_SERVER_USERNAME}")
    private String FTP_SERVER_USERNAME;
    @Value("${FTP_SERVER_PASSWORD}")
    private String FTP_SERVER_PASSWORD;


    @Override
    public PictureResult uploadFile(MultipartFile uploadFile) {
        PictureResult result;

        try {
            // 判断文件是否为空
            if (uploadFile.isEmpty()) {
                return null;
            }
            // 上传文件以日期为单位分开存放，可以提高图片的查询速度
            String filePath = new DateTime().toString("/yyyy/MM/dd");

            // 取原始文件名
            String oldFileName = uploadFile.getOriginalFilename();
            // 新文件名
            String newFileName = IDUtils.genImageName();
            newFileName = newFileName + oldFileName.substring(oldFileName.lastIndexOf("."));
            // 转存文件，上传到ftp服务器
            boolean flag = FtpUtil.uploadFile(FTP_SERVER_IP, FTP_SERVER_PORT, FTP_SERVER_USERNAME, FTP_SERVER_PASSWORD, FILI_UPLOAD_PATH,
                    filePath, newFileName, uploadFile.getInputStream());
            if (!flag) {
                result = new PictureResult(1, null, "文件上传失败");
            }
            result = new PictureResult(0, IMAGE_BASE_URL + filePath + "/" + newFileName);
        } catch (Exception e) {
            result = new PictureResult(1, null, "文件上传发生异常");
        }
        return result;
    }
}
