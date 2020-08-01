package com.wipro.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Sai");
		set.add("Chandra");
		set.add("Sukhesh");
		set.add("Ram");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
