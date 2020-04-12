package kim.spe.mybatis.dao;

import java.util.List;

import kim.spe.mybatis.bean.Employee;

public interface EmployeeMapperDynamicSQL {
	
	public List<Employee> getEmpsByConditionIf(Employee employee);

}
