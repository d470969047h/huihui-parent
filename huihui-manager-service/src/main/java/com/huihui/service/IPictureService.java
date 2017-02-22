package com.huihui.service;

import com.huihui.common.utils.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片管理
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-20 17:28
 */
public interface IPictureService {

    PictureResult uploadFile(MultipartFile uploadFile);
}
