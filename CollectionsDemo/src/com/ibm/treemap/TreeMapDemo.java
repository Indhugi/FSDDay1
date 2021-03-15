package com.ibm.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> accounts = new TreeMap<String, String>();	//used to sort based on key
		accounts.put("-1", "account1");
		accounts.put("-2", "account2");
		System.out.println(accounts);
	}
}
