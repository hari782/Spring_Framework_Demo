package Springclass;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
import java.util.*;

import java.util.Iterator;

import org.springframework.beans.factory.*;

public class SetterInjectionWithMap {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("Springclass/SpringConfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		SetterWithMap sm = (SetterWithMap)b.getBean("s4");
		Map<String, String> ms = sm.getM();
		Set<String> st = ms.keySet();
		Iterator<String> ite = st.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			String value = ms.get(key);
			System.out.println(key +" : "+value);
		}

	}

}
