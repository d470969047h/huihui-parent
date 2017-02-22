package com.huihui.service.impl;

import com.huihui.common.pojo.EUTreeNode;
import com.huihui.mapper.ItemCatPojoMapper;
import com.huihui.pojo.ItemCatPojo;
import com.huihui.pojo.ItemCatPojoExample;
import com.huihui.service.IItemCatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品分类service
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-19 0:07
 */
@Service
public class ItemCatServiceImpl implements IItemCatService {

    @Resource
    private ItemCatPojoMapper itemCatPojoMapper;

    @Override
    public List<EUTreeNode> getItemCatList(long parentId) {
        List<EUTreeNode> result = new ArrayList<>();
        ItemCatPojoExample example = new ItemCatPojoExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        List<ItemCatPojo> list = itemCatPojoMapper.selectByExample(example);

        if (null != list) {
            for (ItemCatPojo item : list) {
                EUTreeNode node = new EUTreeNode();
                node.setId(item.getId());
                node.setText(item.getName());
                //如果是父节点的话就设置成关闭状态，如果是叶子节点就是open状态
                node.setState(item.getIsParent() ? "closed" : "open");
                result.add(node);
            }
        }
        return result;
    }
}
