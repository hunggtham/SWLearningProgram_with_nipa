package org.nipa.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		System.out.println("size: " +list.size());
//		list.add(new String("Hello"));
//		System.out.println("size: " +list.size());
//		list.add(new Integer(1));
//		System.out.println("size: " +list.size());
//		list.add("good morning!");
//		System.out.println("size: " +list.size());
//
//		System.out.println("size: " +list.size());
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + "\t");
//		}
//		list.remove(1);
//
//		System.out.println("size: " +list.size());
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + "\t");
//		}
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("1", "Joy");
		map.put("2", "Bob");
		map.put("3", "Hearth");
		
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
		System.out.println(map.get("3"));
		
		map.put("2", "Hieu");
		System.out.println(map.get("2"));//hashmap : insert into bob -> 2: Hieu, hashtable: 2: hieu
	
		Set set = map.keySet();
		
		
		Iterator iter = set.iterator();
		System.out.println("===========");
		String s= null;
		while(iter.hasNext()) {
			s=(String)iter.next();
			if(s.equals("2")) {
				System.out.println("matched: " + map.get(s));
				break;
			}else {
				System.out.println("not matched");
			}
		}
		System.out.println("End of main");
	}

}
