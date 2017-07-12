package com.paipianwang.pat.facade.team.entity;

import com.paipianwang.pat.common.entity.BaseEntity;

/**
 * 供应商业务技能
 * 20170707
 */
public class PmsTeamSkill extends BaseEntity{
	private static final long serialVersionUID = -601617343742371339L;
	
	private long tsId;//主键
	private long teamId;//供应商id
	private String skillName;//业务名称
	private String createDate;//创建时间
	private String updateDate;//更新时间
	public long getTsId() {
		return tsId;
	}
	public void setTsId(long tsId) {
		this.tsId = tsId;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
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
