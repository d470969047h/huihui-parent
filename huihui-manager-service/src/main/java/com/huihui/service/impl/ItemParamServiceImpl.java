package com.huihui.service.impl;

import com.huihui.common.pojo.HuiHuiResult;
import com.huihui.mapper.ItemParamPojoMapper;
import com.huihui.pojo.ItemParamPojo;
import com.huihui.pojo.ItemParamPojoExample;
import com.huihui.service.IItemParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品管理
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-12-05 23:51
 */
@Service
public class ItemParamServiceImpl implements IItemParamService {

    @Resource
    private ItemParamPojoMapper itemParamPojoMapper;

    @Override
    public HuiHuiResult getItemParamByCid(long cid) {

        ItemParamPojoExample example = new ItemParamPojoExample();
        ItemParamPojoExample.Criteria criteria = example.createCriteria();
        criteria.andItemCatIdEqualTo(cid);
        List<ItemParamPojo> list = itemParamPojoMapper.selectByExample(example);
        if (null != list && list.size() > 0) {
            return HuiHuiResult.ok(list.get(0));
        }
        return HuiHuiResult.ok();
    }
}
