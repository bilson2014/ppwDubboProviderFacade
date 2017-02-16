package com.paipianwang.pat.facade.team.service;

import java.util.List;

import com.paipianwang.pat.facade.team.entity.PmsCity;

/**
 * city Dubbo服务接口
 * @author Jack
 * @version 1.0
 *
 */
public interface PmsCityFacade {

	List<PmsCity> findCitysByProvinceId(String provinceId);

	List<PmsCity> getAll();


}
