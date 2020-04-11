package kim.spe.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import kim.spe.mybatis.bean.Employee;

public interface EmployeeMapper {
	public Employee getEmpById(Integer id);
	public Employee getEmpByLastNameAndGen(@Param("last_name")String last_name,@Param("gender")String gender);
	public boolean addEmp(Employee employee);
	public boolean updateEmp(Employee employee);
	public boolean deleteEmpById(Integer id);
	public List<Employee> getEmpsByLastNameLike(String last_name);	
	public Map<String, Object> getEmpByIdReturnMap(Integer id);
	@MapKey("id")
	public Map<Integer,Employee> getEmpByLastNameLikeReturnMap(String last_name);	
	
}
