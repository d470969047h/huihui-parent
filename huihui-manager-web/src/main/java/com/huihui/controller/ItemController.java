package com.huihui.controller;

import com.huihui.common.pojo.EUDataGridResult;
import com.huihui.common.pojo.HuiHuiResult;
import com.huihui.pojo.ItemPojo;
import com.huihui.service.IItemParamItemService;
import com.huihui.service.IItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 商品管理controller
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-13 19:24
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Resource
    private IItemService itemService;

    @Resource
    private IItemParamItemService itemParamItemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public ItemPojo getItemById(@PathVariable Long itemId){
        ItemPojo itemPojo = itemService.getItemById(itemId);
        return itemPojo;
    }

    @RequestMapping("/list")
    @ResponseBody
    public EUDataGridResult getItemList(int page,int rows){
        EUDataGridResult itemList = itemService.getItemList(page, rows);
        return itemList;
    }

    @RequestMapping("/save")
    @ResponseBody
    public HuiHuiResult saveItem(ItemPojo item, String desc) throws Exception {
        //添加商品信息
        itemService.createItem(item, desc, null);
        return HuiHuiResult.ok();
    }

    /**
     * Description: 获取商品规格信息
     * @param page
     * @param rows
     * @Author daihui
     * @Date 2016-11-24
     * @return EUDataGridResult
     */
    @ResponseBody
    @RequestMapping(value = "/param/list",method = RequestMethod.GET)
    public EUDataGridResult getItemParamItemList(int page,int rows){
        return itemParamItemService.getItemParamList(page,rows);
    }


}
