package kim.spe.mybatis.dao;

import kim.spe.mybatis.bean.Department;

public interface DepartmentMapper {
	public Department getDeptById(Integer id);
	public Department getDeptByIdPlus(Integer id);
	public Department getDeptByIdStep(Integer id);

}
