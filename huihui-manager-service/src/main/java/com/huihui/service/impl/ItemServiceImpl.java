package com.huihui.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huihui.common.pojo.EUDataGridResult;
import com.huihui.common.utils.IDUtils;
import com.huihui.mapper.ItemDesePojoMapper;
import com.huihui.mapper.ItemPojoMapper;
import com.huihui.pojo.ItemDesePojo;
import com.huihui.pojo.ItemPojo;
import com.huihui.pojo.ItemPojoExample;
import com.huihui.service.IItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 商品管理实现类
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-13 18:38
 */
@Service
public class ItemServiceImpl implements IItemService {

    @Resource
    private ItemPojoMapper itemPojoMapper;
    @Resource
    private ItemDesePojoMapper itemDesePojoMapper;

    @Override
    public ItemPojo getItemById(long itemId) {
        ItemPojo itemPojo = itemPojoMapper.selectByPrimaryKey(itemId);
        return itemPojo;
    }

    @Override
    public EUDataGridResult getItemList(int page, int total) {
        ItemPojoExample example = new ItemPojoExample();
        PageHelper.startPage(page, total);
        List<ItemPojo> list = itemPojoMapper.selectByExample(example);
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<ItemPojo> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    @Override
    public void createItem(ItemPojo itemPojo,String desc,String itemParams) {
        //创建商品ID
        long id = IDUtils.genItemId();
        //时间
        Date date = new Date();

        itemPojo.setId(id);
        //商品状态，1:正常，2:下架，3:删除
        itemPojo.setStatus((byte) 1);
        itemPojo.setCreated(date);
        itemPojo.setUpdated(date);
        itemPojoMapper.insert(itemPojo);
        //*********************************
        //商品描述
        ItemDesePojo itemDesePojo = new ItemDesePojo();
        itemDesePojo.setUpdated(date);
        itemDesePojo.setCreated(date);
        //获取一个商品
        itemDesePojo.setItemId(id);
        itemDesePojo.setItemDesc(desc);
        itemDesePojoMapper.insert(itemDesePojo);

    }
}
