package com.paipianwang.pat.facade.team.service;

import java.util.List;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.team.entity.DIffBean;
import com.paipianwang.pat.facade.team.entity.PmsTeamTmp;

/**
 * teamTmp Dubbo服务接口
 * @author Jack
 * @version 1.0
 *
 */
public interface PmsTeamTmpFacade {

	/**
	 * 查询审核列表
	 */
	public DataGrid<PmsTeamTmp> listWithPagination(final PageParam pageParam);

	/**
	 * 审核供应商temp数据
	 * @param teamTmp
	 */
	public void updateTeamTmp(final PmsTeamTmp teamTmp);

	/**
	 * 查询提交审核的供应商的改变
	 */
	public List<DIffBean> findDiffTeam(final Integer teamId);






}
