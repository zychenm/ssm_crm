package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.CustomerMapper;
import cn.itcast.domain.Customer;
import cn.itcast.domain.QueryVo;
import cn.itcast.service.CustomerService;
import cn.itcast.utils.Page;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	public Page findCustomerByQueryVo(QueryVo vo) {
		//返回Page对象
		Page page  = new Page();
		//赋值当前页
		page.setPage(vo.getPageNum());
		//赋值查询的记录结果集
		List<Customer> list = customerMapper.findCustomerByVo(vo);
		page.setRows(list);
		//赋值每条的条数
		page.setSize(vo.getPageSize());
		//赋值分页使用的总记录数
		Integer totalCount = customerMapper.countTotalCustomerByVo(vo);
		page.setTotal(totalCount);
		return page;
	}
	//查询用户对象
	public Customer findCustomerById(Integer custId) {
		
		return customerMapper.findCustomerById(custId);
	}
	public void editCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.editCustomer(customer);
	}
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.deleteCustomer(customer);
	}

}
