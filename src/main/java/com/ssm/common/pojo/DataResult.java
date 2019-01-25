package com.ssm.common.pojo;

import java.io.Serializable;
import java.util.List;

public class DataResult implements Serializable{

	private static final long serialVersionUID = 3519546600434011580L;
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
