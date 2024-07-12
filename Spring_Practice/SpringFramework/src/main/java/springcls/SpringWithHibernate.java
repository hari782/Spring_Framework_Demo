package springcls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringWithHibernate {

	public static void main(String[] args) {
		
		Department dep = new Department();
		dep.setDept_id("dept-1");
		dep.setDept_name("ECE");
		dep.setDept_head("abc");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("springcls/spring_hibernate.xml");
		SpringDAO sd = (SpringDAO)ac.getBean("sp5");
		sd.storeData(dep);

	}

}
