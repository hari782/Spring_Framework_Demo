package Springclass;

import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;

public class DependencyInjection {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("Springclass/SpringConfig.xml");
		BeanFactory bn = new XmlBeanFactory(r);
		Library lib = (Library)bn.getBean("s2");
		System.out.println("Library ID : "+lib.getLib_id());
		System.out.println("Library Name : "+lib.getLib_name());
		book bk = lib.getB();
		System.out.println("Book_Id : "+bk.getBook_id());
		System.out.println("Book Name : "+bk.getBook_name());
		System.out.println("Author : "+bk.getAuthor());
	}

}
