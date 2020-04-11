package kim.spe.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import kim.spe.mybatis.bean.Employee;
import kim.spe.mybatis.dao.EmployeeMapper;
import kim.spe.mybatis.dao.EmployeeMapperPlus;

public class MybatisTest {

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
	
	@Test
	public void test03() {
//		fail("Not yet implemented");
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession openSession = null;
		Employee employee = null;
		
		try {
			//1.get sql sessionFactory
			sqlSessionFactory = getSqlSessionFactory();
			//2.get sql session entity
			openSession = sqlSessionFactory.openSession();
			EmployeeMapperPlus employeeMapperPlus = openSession.getMapper(EmployeeMapperPlus.class);
//			employee = employeeMapperPlus.getEmpAndDept(5);
//			System.out.println(employee);
//			System.out.println(employee.getDept().getDepartmentName());
			employee = employeeMapperPlus.getEmpByIdStep(5);
			System.out.println(employee);
//			System.out.println(employee.getDept().getDepartmentName());
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

