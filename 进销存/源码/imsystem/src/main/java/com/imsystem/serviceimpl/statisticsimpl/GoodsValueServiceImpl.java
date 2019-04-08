package com.imsystem.serviceimpl.statisticsimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imsystem.domain.Goodsvalue;
import com.imsystem.mapper.GoodsvalueMapper;
import com.imsystem.service.statistics.GoodsValueService;
@Service
@Transactional
public class GoodsValueServiceImpl implements GoodsValueService{

	@Autowired
	GoodsvalueMapper gvm;
	
	@Override
	public List<Goodsvalue> queryByCode(String code) {
		// TODO Auto-generated method stub
		return gvm.queryByCode(code);
	}

}
