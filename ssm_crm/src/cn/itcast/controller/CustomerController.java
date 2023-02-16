package cn.itcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.domain.BaseDict;
import cn.itcast.domain.Customer;
import cn.itcast.domain.QueryVo;
import cn.itcast.service.BaseDictService;
import cn.itcast.service.CustomerService;
import cn.itcast.utils.Page;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerService;
	
	@Value("${sourceCode}")
	private String sourceCode;
	@Value("${levelCode}")
	private String levelCode;
	@Value("${industryCode}")
	private String industryCode;
	
	@RequestMapping("/listCustomer")
	public String listCustomer(Model model,QueryVo vo){
		
		//跳转页面得到字典的条件数据
		List<BaseDict> sourceList = baseDictService.findBaseDictByCode(sourceCode);
		List<BaseDict> levelList = baseDictService.findBaseDictByCode(levelCode);
		List<BaseDict> industryList = baseDictService.findBaseDictByCode(industryCode);
		//将得到的字典数据传递到页面
		model.addAttribute("fromType", sourceList);
		model.addAttribute("industryType", industryList);
		model.addAttribute("levelType", levelList);
		
		//通过传递的QueryVo对象查询数据的Page
		Page page = customerService.findCustomerByQueryVo(vo);
		//将page对象传递到页面展示1
		model.addAttribute("page", page);
		//将查询的数据返回给jsp页面
		model.addAttribute("queryVo",vo);
		
		return "list";
	}

	/*
	 * 通过传递的用户id
	 * 查询用户对象
	 * 回显到jsp页面
	 * 
	 * */
	@RequestMapping("/editCustomerById")
	@ResponseBody
	public Customer editCustomerById(Integer custId){
		
		Customer customer = customerService.findCustomerById(custId);
		
		return customer;
	}
	/*
	 * 编写保存客户的方法
	 * */
	@RequestMapping("/editCustomer")
	@ResponseBody
	public Customer editCustomer(Customer customer){
		
		customerService.editCustomer(customer);
		System.out.println(customer.toString());
		return customer;
	}
	
	/*
	 * 编写保存客户的方法
	 * */
	@RequestMapping("/deleteCustomer")
	@ResponseBody
	public Customer deleteCustomer(Customer customer){
		
		customerService.deleteCustomer(customer);
		
		return customer;
	}
}
