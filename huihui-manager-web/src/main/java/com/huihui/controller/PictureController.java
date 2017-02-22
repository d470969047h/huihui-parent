package com.huihui.controller;

import com.huihui.common.utils.JsonUtils;
import com.huihui.common.utils.PictureResult;
import com.huihui.service.IPictureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 图片管理
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-20 17:58
 */
@Controller
@RequestMapping("/pic")
public class PictureController {

    @Resource
    private IPictureService pictureService;

    /**
     * 图片上传
     * @param uploadFile
     * @return.
     */
    @ResponseBody
    @RequestMapping("/upload")
    public String picUpload(MultipartFile uploadFile){
        PictureResult result = pictureService.uploadFile(uploadFile);
        //转成json格式，防止火狐浏览器不兼容问题
        return JsonUtils.objectToJson(result);
    }
}
