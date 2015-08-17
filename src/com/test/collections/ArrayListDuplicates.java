package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicates {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Set<String> linkedList = new HashSet<String>(list);
		
		list.clear();
		list.addAll(linkedList);
		
		System.out.println(list);
		
		
	}
}
