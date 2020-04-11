package kim.spe.mybatis.bean;

import org.apache.ibatis.type.Alias;

public class Employee {
	private Integer id;
	private String last_name;
	private String email;
	private String gender;
	private Department dept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", last_name=" + last_name + ", email=" + email + ", gender=" + gender + ", dept="
				+ dept.getDepartmentName() + "]";
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
