package com.huihui.controller;

import com.huihui.common.pojo.EUTreeNode;
import com.huihui.service.IItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品分类
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-19 0:30
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Resource
    private IItemCatService iItemCatService;

    /**
     * 获取商品分类列表
     * @param parentId
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List getItemCatList(@RequestParam(value = "id",defaultValue = "0") long parentId){
        List<EUTreeNode> itemCatList = iItemCatService.getItemCatList(parentId);
        return itemCatList;
    }
}
