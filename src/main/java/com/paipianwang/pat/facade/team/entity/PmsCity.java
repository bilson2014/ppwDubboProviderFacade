package com.paipianwang.pat.facade.team.entity;

import com.paipianwang.pat.common.entity.BaseEntity;

/**
 * 级联“市”
 * @author wang
 */
public class PmsCity extends BaseEntity {

	private static final long serialVersionUID = 7933928369958873968L;
	/**市名**/
	private String city;
	/**市ID**/
	private String cityID;
	/**父级ID（省ID）**/
	private String father;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityID() {
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

}
