package com.taotao.common.pojo;

import java.util.List;

/**
 * 数据格式
 * @author lenovo
 *
 */
public class EUDataGridResult {
	/**
	 * 总数
	 */
	private long total;
	/**
	 * 集合
	 */
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
