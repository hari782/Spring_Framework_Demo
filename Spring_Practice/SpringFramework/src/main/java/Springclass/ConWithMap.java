package Springclass;
//c4

import java.util.*;

public class ConWithMap {
	
	private Map<String,String> m;

	public ConWithMap(Map<String, String> m) {
		super();
		this.m = m;
	}
	
	
	public void showMap() {
		Set<String> st = m.keySet();
		Iterator<String> ite = st.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			String value = m.get(key);
			
			System.out.println(key+ " : "+value);
		}
	}
}
