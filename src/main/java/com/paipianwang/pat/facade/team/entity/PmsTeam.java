package com.paipianwang.pat.facade.team.entity;

import com.paipianwang.pat.facade.right.entity.PmsCustomer;

public class PmsTeam extends PmsCustomer {
	private static final long serialVersionUID = 1L;
	/** 团队名称 **/
	private String teamName = null;
	/** 团队照片 **/
	private String teamPhotoUrl = null;
	/** 团队介绍 **/
	private String teamDescription = null;
	/** 创建时间 **/
	private String createDate = null;
	/** 用于排序 **/
	private int od;
	/** 更新时间 **/
	private String updateDate = null;
	/** 123456 密码 **/
	private String password = "E10ADC3949BA59ABBE56E057F20F883E";
	/** 联系电话 **/
	private String phoneNumber = null;
	/** 邮箱 **/
	private String email = null;
	/** 公司地址 **/
	private String address = null;
	/** 状态位 0未审核1审核通过2审核未通过 **/
	private int flag = 0;
	/** 登陆名 **/
	private String loginName = null;
	/** 审核意见 **/
	private String recommendation = null;
	/** 联系人 **/
	private String linkman = null;
	/** 微信号 **/
	private String webchat = null;
	/** QQ号 **/
	private String qq = null;
	/** 官方网站 **/
	private String officialSite = null;
	/** 公司规模 **/
	private String scale = null;
	/** 公司成立时间 **/
	private String establishDate = null;
	/** 客户描述 **/
	private String businessDesc = null;
	/** 价格区间 **/
	private int priceRange;
	/** 客户要求 **/
	private String demand;
	/** 获知渠道 **/
	private int infoResource = 0;
	/** 备注 **/
	private String description = null;
	/** QQToken **/
	private String qqUnique = null;
	/** 微博Token **/
	private String wbUnique = null;
	/** 微信Token **/
	private String wechatUnique = null;
	/** 三方登录唯一ID **/
	private String uniqueId = null;
	/** 城市ID **/
	private PmsCity pmsCity;
	/** 省ID **/
	private PmsProvince pmsProvince;
	/** 是否推荐到主页 **/
	private Boolean recommend;
	/** 主页推荐排序 **/
	private Integer recommendSort;
	private long teamId = 0l;
	private int city = 0; // 城市
	/** 团队显示名称 **/
	private String displayName = null;
	/** 团队显示图片 **/
	private String displayImg = null;

	/** -----非数据库字段 begin--------- */
	
	/**产品线 - 多个以‘,’分隔**/
	private String productLine=null;
	/**公司性质 0-公司 1-工作室**/
	private int teamNature;
	/**营业执照（公司）/身份证（工作室）**/
	private String certificateUrl=null;
	/**法人手持身份证-正面**/
	private String idCardfrontUrl=null;
	/**法人手持身份证-反面**/
	private String idCardbackUrl=null;
	/**固定电话**/
	private String telNumber=null;
	
	/**-----非持久化字段 begin---------*/

	private String thirdLoginType = null; // 第三方登录类型
	// 再次审核 状态
	private Integer checkStatus; // 再次审核状态 tmp表冗余字段 0未审核 1审核通过 2审核失败
	private String checkDetails;// 再次审核详情

	private String verification_code = null; // 短信验证码

	private String loginType;// 登录方式

	/** 业务范围 **/
	private String business = null;
	
	/**产品线显示名称**/
	private String productLineName=null;

	/** -----非数据库字段 end-------- */
	
	/** 业务技能**/
	private String skill=null;
	
	/**-----非持久化字段 end--------*/
	
	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public final static String LTYPE_WEIBO = "weibo";

	public final static String LTYPE_QQ = "qq";

	public final static String LTYPE_WECHAT = "wechat";

	private String teamCity = null; // 城市ID

	private String teamProvince = null; // 省ID

	// 冗余字段
	private String teamProvinceName = null;// 省名

	private String teamCityName = null; // 城市名

	public String getTeamCity() {
		return teamCity;
	}

	public void setTeamCity(String teamCity) {
		this.teamCity = teamCity;
	}

	public String getTeamProvince() {
		return teamProvince;
	}

	public void setTeamProvince(String teamProvince) {
		this.teamProvince = teamProvince;
	}

	public String getTeamProvinceName() {
		return teamProvinceName;
	}

	public void setTeamProvinceName(String teamProvinceName) {
		this.teamProvinceName = teamProvinceName;
	}

	public String getTeamCityName() {
		return teamCityName;
	}

	public void setTeamCityName(String teamCityName) {
		this.teamCityName = teamCityName;
	}

	public String getThirdLoginType() {
		return thirdLoginType;
	}

	public void setThirdLoginType(String thirdLoginType) {
		this.thirdLoginType = thirdLoginType;
	}

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getCheckDetails() {
		return checkDetails;
	}

	public void setCheckDetails(String checkDetails) {
		this.checkDetails = checkDetails;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamPhotoUrl() {
		return teamPhotoUrl;
	}

	public void setTeamPhotoUrl(String teamPhotoUrl) {
		this.teamPhotoUrl = teamPhotoUrl;
	}

	public String getTeamDescription() {
		return teamDescription;
	}

	public void setTeamDescription(String teamDescription) {
		this.teamDescription = teamDescription;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public int getOd() {
		return od;
	}

	public void setOd(int od) {
		this.od = od;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getWebchat() {
		return webchat;
	}

	public void setWebchat(String webchat) {
		this.webchat = webchat;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getOfficialSite() {
		return officialSite;
	}

	public void setOfficialSite(String officialSite) {
		this.officialSite = officialSite;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getBusinessDesc() {
		return businessDesc;
	}

	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}

	public int getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}

	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}

	public int getInfoResource() {
		return infoResource;
	}

	public void setInfoResource(int infoResource) {
		this.infoResource = infoResource;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQqUnique() {
		return qqUnique;
	}

	public void setQqUnique(String qqUnique) {
		this.qqUnique = qqUnique;
	}

	public String getWbUnique() {
		return wbUnique;
	}

	public void setWbUnique(String wbUnique) {
		this.wbUnique = wbUnique;
	}

	public String getWechatUnique() {
		return wechatUnique;
	}

	public void setWechatUnique(String wechatUnique) {
		this.wechatUnique = wechatUnique;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public PmsCity getPmsCity() {
		return pmsCity;
	}

	public void setPmsCity(PmsCity pmsCity) {
		this.pmsCity = pmsCity;
	}

	public PmsProvince getPmsProvince() {
		return pmsProvince;
	}

	public void setPmsProvince(PmsProvince pmsProvince) {
		this.pmsProvince = pmsProvince;
	}

	public Boolean getRecommend() {
		return recommend;
	}

	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public Integer getRecommendSort() {
		return recommendSort;
	}

	public void setRecommendSort(Integer recommendSort) {
		this.recommendSort = recommendSort;
	}

	public String getVerification_code() {
		return verification_code;
	}

	public void setVerification_code(String verification_code) {
		this.verification_code = verification_code;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public int getTeamNature() {
		return teamNature;
	}

	public void setTeamNature(int teamNature) {
		this.teamNature = teamNature;
	}

	public String getCertificateUrl() {
		return certificateUrl;
	}

	public void setCertificateUrl(String certificateUrl) {
		this.certificateUrl = certificateUrl;
	}

	public String getIdCardfrontUrl() {
		return idCardfrontUrl;
	}

	public void setIdCardfrontUrl(String idCardfrontUrl) {
		this.idCardfrontUrl = idCardfrontUrl;
	}

	public String getIdCardbackUrl() {
		return idCardbackUrl;
	}

	public void setIdCardbackUrl(String idCardbackUrl) {
		this.idCardbackUrl = idCardbackUrl;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	

	public String getProductLineName() {
		return productLineName;
	}

	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayImg() {
		return displayImg;
	}

	public void setDisplayImg(String displayImg) {
		this.displayImg = displayImg;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PmsTeam other = (PmsTeam) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (business == null) {
			if (other.business != null)
				return false;
		} else if (!business.equals(other.business))
			return false;
		if (demand == null) {
			if (other.demand != null)
				return false;
		} else if (!demand.equals(other.demand))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (infoResource != other.infoResource)
			return false;
		if (linkman == null) {
			if (other.linkman != null)
				return false;
		} else if (!linkman.equals(other.linkman))
			return false;
		if (priceRange != other.priceRange)
			return false;
		if (qq == null) {
			if (other.qq != null)
				return false;
		} else if (!qq.equals(other.qq))
			return false;
		if (scale == null) {
			if (other.scale != null)
				return false;
		} else if (!scale.equals(other.scale))
			return false;
		if (teamCity == null) {
			if (other.teamCity != null)
				return false;
		} else if (!teamCity.equals(other.teamCity))
			return false;
		if (teamDescription == null) {
			if (other.teamDescription != null)
				return false;
		} else if (!teamDescription.equals(other.teamDescription))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (teamProvince == null) {
			if (other.teamProvince != null)
				return false;
		} else if (!teamProvince.equals(other.teamProvince))
			return false;
		if (webchat == null) {
			if (other.webchat != null)
				return false;
		} else if (!webchat.equals(other.webchat))
			return false;
		if (teamPhotoUrl == null) {
			if (other.teamPhotoUrl != null)
				return false;
		} else if (!teamPhotoUrl.equals(other.teamPhotoUrl))
			return false;
		return true;
	}

}
