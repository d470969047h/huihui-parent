package com.huihui.service;

import com.huihui.common.pojo.EUDataGridResult;
import com.huihui.pojo.ItemPojo;

/**
 * 商品管理service
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-13 18:35
 */
public interface IItemService {

    /**
     * 根据商品ID获取商品
     * @param itemId
     * @return
     */
    ItemPojo getItemById(long itemId);

    /**
     * 获取商品列表
     * @param page
     * @param total
     * @return
     */
    EUDataGridResult getItemList(int page,int total);

    /**
     * 创建新商品信息
     * @param itemPojo
     * @param desc
     * @param itemParams
     * @return
     */
    void createItem(ItemPojo itemPojo,String desc,String itemParams);


}
