package Springclass;

import java.util.Iterator;
import java.util.List;
import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.BeanFactory;

public class SetterWithList {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("Springclass/SpringConfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		QuestionAndAnswer qa = (QuestionAndAnswer)b.getBean("s3");
		
		System.out.println("Question ID : "+qa.getQid());
		System.out.println("Question Name : "+qa.getQname());
		System.out.println("Answer are...");
		List<String> lst = qa.getAns();
		Iterator<String> ite = lst.iterator();
		while(ite.hasNext()) {
			String answer = ite.next();
			System.out.println("\t"+answer);
		}
	}
}
