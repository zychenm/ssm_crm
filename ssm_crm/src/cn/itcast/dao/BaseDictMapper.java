package cn.itcast.dao;

import java.util.List;

import cn.itcast.domain.BaseDict;

public interface BaseDictMapper {
	
	/**
	 * 根据传递的字典code查询数据集合
	 * @return
	 */
	public List<BaseDict> findBaseDictByTypeCode(String typeCode);
}
