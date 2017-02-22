package com.huihui.service;

import com.huihui.common.pojo.EUTreeNode;

import java.util.List;

/**
 * 商品分类接口
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-19 0:04
 */
public interface IItemCatService {
    /**
     * 获取商品分类
     * @param parentId
     * @return
     */
    List<EUTreeNode> getItemCatList(long parentId);
}
