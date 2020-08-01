package com.wipro.Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Sai");
		set.add("Chandra");
		set.add("Sukhesh");
		set.add("Ram");
		
		Iterator<String> it = set.iterator();
		String query = "Chandra";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}
