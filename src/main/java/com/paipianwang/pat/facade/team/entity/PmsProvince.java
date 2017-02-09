package com.paipianwang.pat.facade.team.entity;

import com.paipianwang.pat.common.entity.BaseEntity;

/**
 * 级联“省”
 * @author wang
 */
public class PmsProvince extends BaseEntity {

	private static final long serialVersionUID = -9199573140181925699L;
	/**省ID**/
	private String provinceID;
	/**省名**/
	private String provinceName;

	public String getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}


}
