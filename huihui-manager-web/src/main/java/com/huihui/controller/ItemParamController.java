package com.huihui.controller;

import com.huihui.common.pojo.HuiHuiResult;
import com.huihui.service.IItemParamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品规格模板管理Controller
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-12-06 0:06
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {
        private IItemParamService itemParamService;

    @ResponseBody
    @RequestMapping("/query/itemcatid/{itemCatId}")
    public HuiHuiResult getItemParamByCid(@PathVariable Long itemCatId){
        HuiHuiResult result = itemParamService.getItemParamByCid(itemCatId);
        return result;
    }
}
