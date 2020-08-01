package com.wipro.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("sai");
		list.add("chandra");
		list.add("sukhesh");
		list.add("ram");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}