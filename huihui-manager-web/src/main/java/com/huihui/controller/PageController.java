package com.huihui.controller;

import com.huihui.mapper.ItemPojoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 后台首页
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-13 20:48
 */
@Controller
public class PageController {

    @Resource
    private ItemPojoMapper itemPojoMapper;
    /**
     * 进入首页
     * @return
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    /**
     * 展示子页面
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }



}
