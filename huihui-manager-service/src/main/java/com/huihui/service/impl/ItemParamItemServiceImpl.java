package com.huihui.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huihui.common.pojo.EUDataGridResult;
import com.huihui.mapper.ItemParamItemPojoMapper;
import com.huihui.pojo.ItemParamItemPojo;
import com.huihui.pojo.ItemParamItemPojoExample;
import com.huihui.service.IItemParamItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-24 23:36
 */
@Service
public class ItemParamItemServiceImpl implements IItemParamItemService {

    @Resource
    private ItemParamItemPojoMapper paramItemPojoMapper;

    @Override
    public EUDataGridResult getItemParamList(int page, int rows) {
        EUDataGridResult result = new EUDataGridResult();
        ItemParamItemPojoExample example = new ItemParamItemPojoExample();
        PageHelper.startPage(page, rows);
        List<ItemParamItemPojo> list = paramItemPojoMapper.selectByExample(example);
        PageInfo<ItemParamItemPojo> pageInfo = new PageInfo<>(list);
        result.setRows(pageInfo.getList());
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
