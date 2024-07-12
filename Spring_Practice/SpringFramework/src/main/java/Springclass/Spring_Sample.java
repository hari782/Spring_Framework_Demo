package Springclass;
//Spring Sample Program

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@SuppressWarnings("deprecation")
public class Spring_Sample {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("Springclass/SpringConfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		book Book = (book)b.getBean("s1");
		
		System.out.println("Book_Id : "+Book.getBook_id());
		System.out.println("Book_Name : "+Book.getBook_name());
		System.out.println("Author : "+Book.getAuthor());
		

	}

}
