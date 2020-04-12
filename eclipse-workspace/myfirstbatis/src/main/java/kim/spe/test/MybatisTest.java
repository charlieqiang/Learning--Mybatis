package kim.spe.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import kim.spe.mybatis.bean.Department;
import kim.spe.mybatis.bean.Employee;
import kim.spe.mybatis.dao.DepartmentMapper;
import kim.spe.mybatis.dao.EmployeeMapper;
import kim.spe.mybatis.dao.EmployeeMapperDynamicSQL;
import kim.spe.mybatis.dao.EmployeeMapperPlus;

public class MybatisTest {
	private static final Logger logger01 = Logger.getLogger(MybatisTest.class);
//	@Test
//	public void test() {
////		fail("Not yet implemented");
//		String resource = "mybatis-config.xml";
//		InputStream inputStream = null;
//		SqlSessionFactory sqlSessionFactory = null;
//		SqlSession openSession = null;
//		try {
//			inputStream = Resources.getResourceAsStream(resource);
//			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//			//2.get sql session entity
//			openSession = sqlSessionFactory.openSession();
//			Employee employee = openSession.selectOne("kim.spe.mybatis.EmployMapper.selectEmp",1);
//			System.out.println("getUserByMybatis:"+employee);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
////			openSession.close();
//		}
//		
//	}
//	
//	@Test
//	public void test01() {
////		fail("Not yet implemented");
//		SqlSessionFactory sqlSessionFactory = null;
//		SqlSession openSession = null;
//		Employee employee = null;
//		
//		try {
//			//1.get sql sessionFactory
//			sqlSessionFactory = getSqlSessionFactory();
//			//2.get sql session entity
//			openSession = sqlSessionFactory.openSession();
//			//3.get inter
//			EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//			//4.call method
//			employee = employeeMapper.getEmpById(1);
//			//5.get user(Proxy Obj)
//			System.out.println("getMapperObj:"+employeeMapper.getClass());
//			System.out.println("getUserByinter:"+employee);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			openSession.close();
//		}
//		
//	}
	
//	@Test
//	public void test02() {
////		fail("Not yet implemented");
//		SqlSessionFactory sqlSessionFactory = null;
//		SqlSession openSession = null;
//		Employee employee = null;
//		
//		try {
//			//1.get sql sessionFactory
//			sqlSessionFactory = getSqlSessionFactory();
//			//2.get sql session entity
//			openSession = sqlSessionFactory.openSession();
//			//3.get inter
//			EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//			//4.call method			
////			employee = new Employee(null, "Bob", "hello@spe.kim", "0");
////			List<Employee> like = employeeMapper.getEmpsByLastNameLike("%o%");
//			
////			for(Employee emp:like) {
////				System.out.println(emp);
////			}
//			
////			Map<String, Object> map = employeeMapper.getEmpByIdReturnMap(5);
//			
//			Map<Integer,Employee> map = employeeMapper.getEmpByLastNameLikeReturnMap("%c%");
//			System.out.println(map);
////			boolean b = employeeMapper.deleteEmpById(2);
//			
//			
//			//5.commit
//			openSession.commit();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			openSession.close();
//		}
//		
//	}
	
//	@Test
//	public void test03() {
//		
////		fail("Not yet implemented");
//		SqlSessionFactory sqlSessionFactory = null;
//		SqlSession openSession = null;
//		Employee employee = null;
//		
//		try {
//			//1.get sql sessionFactory
//			sqlSessionFactory = getSqlSessionFactory();
//			//2.get sql session entity
//			openSession = sqlSessionFactory.openSession();
//			EmployeeMapperPlus employeeMapperPlus = openSession.getMapper(EmployeeMapperPlus.class);
////			employee = employeeMapperPlus.getEmpAndDept(5);
////			System.out.println(employee);
////			System.out.println(employee.getDept().getDepartmentName());
//			employee = employeeMapperPlus.getEmpByIdStep(6);
//			logger01.debug(employee);
////			System.out.println(employee.getDept().getDepartmentName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			openSession.close();
//		}
//		
//	}
	
//	@Test
//	public void test05() {
//		
////		fail("Not yet implemented");
//		SqlSessionFactory sqlSessionFactory = null;
//		SqlSession openSession = null;
//		Department department = null;
//		
//		try {
//			//1.get sql sessionFactory
//			sqlSessionFactory = getSqlSessionFactory();
//			//2.get sql session entity
//			openSession = sqlSessionFactory.openSession();
//			DepartmentMapper departmentMapper = openSession.getMapper(DepartmentMapper.class);
//			
//			department = departmentMapper.getDeptByIdStep(2);
//			logger01.debug(department);
////			System.out.println(department);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
////			openSession.close();
//		}
//		
//	}
	
//	@Test
//	public void test06() {
//
//		SqlSessionFactory sqlSessionFactory = null;
//		SqlSession openSession = null;
//		Employee employee = null;
//		
//		try {
//			//1.get sql sessionFactory
//			sqlSessionFactory = getSqlSessionFactory();
//			//2.get sql session entity
//			openSession = sqlSessionFactory.openSession();
//			EmployeeMapperDynamicSQL dynamicSQL = openSession.getMapper(EmployeeMapperDynamicSQL.class);
//			employee = new Employee(null, null, null, "1", null);
//			List<Employee> emps = dynamicSQL.getEmpsByConditionIf(employee);
//			
//			for(Employee emp:emps) {
//				System.out.println(emp);
//			}
//				
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			openSession.close();
//		}
//		
//	}

	@Test
	public void test07() {

		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		Employee employee = null;
		
		try {
			//1.get sql sessionFactory
			sqlSessionFactory = getSqlSessionFactory();
			//2.get sql session entity
			openSession = sqlSessionFactory.openSession();
			
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			employee = mapper.getEmpById(5);
			System.out.println(employee);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		
	}
	private SqlSessionFactory getSqlSessionFactory() throws IOException {
		// TODO Auto-generated method stub
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

}

