package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.BaseDictMapper;
import cn.itcast.domain.BaseDict;
import cn.itcast.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	public List<BaseDict> findBaseDictByCode(String typeCode) {
		// TODO Auto-generated method stub
		return baseDictMapper.findBaseDictByTypeCode(typeCode);
	}

}
