package cn.itcast.service;

import cn.itcast.domain.Customer;
import cn.itcast.domain.QueryVo;
import cn.itcast.utils.Page;

public interface CustomerService {
	
	/**
	 * 组装page对象返回
	 * @param vo
	 * @return
	 */
	public Page findCustomerByQueryVo(QueryVo vo);
	//通过id查询用户数据
	public Customer findCustomerById(Integer custId);
	//修改用户
	public void editCustomer(Customer customer);
	//删除当前用户
	public void deleteCustomer(Customer customer);
}
