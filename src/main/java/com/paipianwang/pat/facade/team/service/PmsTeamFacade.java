package com.paipianwang.pat.facade.team.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.team.entity.PmsTeam;

/**
 * team Dubbo服务接口
 * @author Jack
 * @version 1.0
 *
 */
public interface PmsTeamFacade {

	/**
	 * 查询team dataGrid列表
	 * @param pageParam 分页参数
	 * @param paramMap 搜索参数
	 */
	public DataGrid<PmsTeam> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);

	/**
	 * 查询供应商信息
	 * @param teamId 供应商ID
	 */
	public PmsTeam findTeamById(final Long teamId);

	/**
	 * 查询供应商信息
	 * @param teamId 供应商ID
	 */
	public PmsTeam getTeamInfo(final Long teamId);

	/**
	 * 查询供应商标签内容
	 * @param ids 标签标识
	 */
	public List<String> getTags(List<Integer> ids);

	/**
	 * 检查手机号或者用户名唯一性 如果没有,则返回0,有则返回存在的条目数
	 * @param phoneNumber
	 *            电话号码
	 * @return 数据个数
	 */
	public long checkExist(final PmsTeam team);
	
	/**
	 * 供应商注册
	 * 
	 * @param original
	 *            供应商信息
	 * @return 新增数据个数
	 */
	public PmsTeam register(final PmsTeam team);
	/**
	 * 供应商登录
	 * 
	 * @param original
	 *            包含(登录名和密码(已加密))
	 * @return
	 */
	public PmsTeam doLogin(final String phoneNumber);

	/**
	 * 根据用户名和密码登录供应商
	 * 
	 * @param original
	 * @return
	 */
	public PmsTeam findTeamByLoginNameAndPwd(final PmsTeam original);
	/**
	 * 根据 ID 获取 team 信息
	 * 
	 * @param id
	 *            team ID
	 * @return team
	 */
	public long updateTeamAccount(final PmsTeam team);

	/**
	 * 供应商 基础信息更新(供应商名称、简介、地址、邮箱等)
	 * 
	 * @return 数据受影响个数
	 */
	public long updateTeamInfomation(final PmsTeam team);
	/**
	 * 更新供应商备注信息
	 */
	public long updateTeamDescription(final PmsTeam team);

	/**
	 * 处理tmpteam数据
	 */
	public void dealTeamTmp(final PmsTeam team);

	/**
	 * 查询最新的供应商信息，如果有未审核的，则未审核的信息未最新
	 */
	public PmsTeam findLatestTeamById(final Long teamId);

	/**
	 * 根据登录名修改密码
	 * 
	 * @param team
	 *            (包含 登录名和密码)
	 * @return 数据受影响个数
	 */
	public long updatePasswordByLoginName(final PmsTeam team);

	/**
	 * 修改手机号
	 */
	public long modifyTeamPhone(final PmsTeam team);
	/**
	 * 获取所有 team 信息
	 * 
	 * @return
	 */
	public List<PmsTeam> getAll();

	/**
	 * 新建一个team
	 */
	public long save(final PmsTeam team);

	/**
	 * 保存 图片路径
	 */
	public long saveTeamPhotoUrl(final PmsTeam team);

	/**
	 * 更新供应商信息
	 */
	public long update(final PmsTeam team);

	/**
	 * 删除后返回信息列表，便于删除文件
	 * 
	 * @param ids
	 *            编号数组
	 * @return 团队列表
	 */
	public List<PmsTeam> delete(long[] ids);

	/**
	 * 查找未被推荐的供应商
	 */
	public List<PmsTeam> getAllNoRecommend();

	/**
	 * 添加供应商首页推荐
	 */
	public boolean addRecommend(final long teamId);

	/**
	 * 供应商推荐 上移
	 */
	public boolean moveUp(final long teamId);

	/**
	 * 供应商推荐 下移
	 */
	public boolean moveDown(final long teamId);

	/**
	 * 供应商推荐 删除
	 */
	public boolean delRecommend(final long teamId);
	/**
	 * 获取首页推荐供应商列表
	 */
	public List<PmsTeam> teamRecommendList();
	/**
	 * 获取所有 team 信息
	 * 
	 * @return
	 */
	public List<PmsTeam> getAllTeamName();
	/**
	 * 基本信息解除绑定第三方
	 */
	public boolean teamInfoUnBind(PmsTeam team);
	
	/**
	 * 根据搜索参数获取供应商列表
	 * @param paramMap 搜索参数
	 * @return
	 */
	public List<PmsTeam> listWithParam(final Map<String, Object> paramMap);



}
