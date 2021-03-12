package com.ibm.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.ibm.Book;

public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
	}

	private static void createMapofBooks() {
		Map<String,Book> books=new HashMap<String,Book>();	//no key value pairs at this point
		System.out.println(books.size());
//		Book book1=new Book("Java");
//		books.put("book1",book1);
//		System.out.println(books.size());
		for (int i = 0; i < 10; i++) {
			Book book=new Book("Title"+i);
			books.put("Book"+i,book);
			//System.out.println(books);
		}
		System.out.println(books.containsKey("Book1"));
		//System.out.println(books.containsValue("Title1"));
		
	}
}
