package Springclass;
//c1
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ConstructorInjection {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("Springclass/SpringConfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		Product pro = (Product)b.getBean("c1");
		pro.displayProduct();

	}

}
