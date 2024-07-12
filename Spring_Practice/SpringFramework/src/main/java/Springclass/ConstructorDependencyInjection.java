package Springclass;
//c2
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorDependencyInjection {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("Springclass/SpringConfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		Customer cust = (Customer)b.getBean("c2");
		cust.displayCustomerData();
	}

}
