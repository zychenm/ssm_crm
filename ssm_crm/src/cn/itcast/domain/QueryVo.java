package cn.itcast.domain;

public class QueryVo {
	
	//接受页面传参数的属性
	private String custName; //姓名
	private String custLevel; //级别
	private String custSource;//来源
	private String custIndustry;//行业
	private Integer pageNum =1;//默认查询第一页
	private Integer pageSize = 3;//默认每页显示十条
	private Integer startIndex =0;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getStartIndex() {
		
		return (this.pageNum-1)*this.pageSize;
		
	}
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	
	
	
	
	
}
