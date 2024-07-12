package Springclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application_ContextDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext b = new ClassPathXmlApplicationContext("Springclass/SpringConfig.xml");
		book bk = (book)b.getBean("s1");
		bk.setBook_name("The complete reference of Spring");
		bk.setAuthor("Rod Johnson");
		
		System.out.println("Book ID : "+bk.getBook_id());
		System.out.println("Book Name : "+bk.getBook_name());
		System.out.println("Author : "+bk.getAuthor());
		
		ApplicationContext b1 = new ClassPathXmlApplicationContext("Springclass/SpringConfig.xml");
		book bk1 = (book)b1.getBean("s1");
		
		System.out.println("Book ID : "+bk1.getBook_id());
		System.out.println("Book Name : "+bk1.getBook_name());
		System.out.println("Author : "+bk1.getAuthor());
	}

}
