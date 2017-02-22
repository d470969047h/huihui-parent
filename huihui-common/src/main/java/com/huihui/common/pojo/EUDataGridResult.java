package com.huihui.common.pojo;

import java.util.List;

/**
 * easyUI的datagrid实体
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-11-17 22:27
 */
public class EUDataGridResult {

    private long total;

    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
