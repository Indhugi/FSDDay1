package com.ibm.linkedlist;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for (int i = 0; i < 5; i++) {
			names.add("Joy" + i);
		}
		System.out.println(names);
		names.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				// boolean myboolean=(o2.equals(o1));
				// int myint=myboolean?1:-1;
				// return myint;
				int value2 = Integer.valueOf(o2.substring(3));
				int value1 = Integer.valueOf(o1.substring(3));
				return value2 - value1;
			}

		});
		System.out.println(names);

	}
}
