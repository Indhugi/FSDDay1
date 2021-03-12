package com.ibm.set;
	
import java.util.HashSet;
import java.util.Set;	//ctrl+shift+O
import com.ibm.Book;

public class SetDemo {
	public static void main(String[] args) {
		createBookset();
	}

	private static void createBookset() {
		 Set<Book> books=new HashSet<Book>();
		 for (int i = 0; i < 4; i++) {
			Book book=new Book("Title"+i);
			book.setPrice(100*i);
			book.setPublishYear(i+2000);
			books.add(book);
		}
		System.out.println(books);
	}	
}
