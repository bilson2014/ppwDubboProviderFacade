package com.paipianwang.pat.facade.team.entity;

import com.paipianwang.pat.common.entity.BaseEntity;

/**
 * 供应商业务范围
 * 20170705
 */
public class PmsTeamBusiness extends BaseEntity{
	private static final long serialVersionUID = -6380724417773245861L;
	private long tbId;//主键
	private long teamId;//供应商id
	private String businessName;//业务名称
	private String createDate;//创建时间
	private String updateDate;//更新时间
	
	public long getTbId() {
		return tbId;
	}
	public void setTbId(long tbId) {
		this.tbId = tbId;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
