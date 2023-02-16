package cn.itcast.dao;

import java.util.List;

import cn.itcast.domain.Customer;
import cn.itcast.domain.QueryVo;

public interface CustomerMapper {
	//查询分页显示的数据
	public List<Customer> findCustomerByVo(QueryVo queryVo);
	//查询分页的总记录数量
	public Integer countTotalCustomerByVo(QueryVo queryVo);
	//查询用户对象
	public Customer findCustomerById(Integer custId);
	//修改用户
	public void editCustomer(Customer customer);
	//删除用户
	public void deleteCustomer(Customer customer);
}
