package kim.spe.mybatis.dao;

import java.util.Map;

import kim.spe.mybatis.bean.Employee;

public interface EmployeeMapperPlus {
	public Employee getEmpById(Integer id);
	public Employee getEmpAndDept(Integer id);
	
	public Employee getEmpByIdStep(Integer id);
	
	
}
