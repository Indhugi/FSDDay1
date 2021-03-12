
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ibm.Book;

public class ListDemo {
	public static void main(String[] args) {
		// demo();
		booklist();
	}

	private static void booklist() {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("Learn Java");
		book1.setPrice(100.0f);
		book1.setPublishYear(1990);
		books.add(book1);
		Book book2 = new Book("Javascript");
		book2.setPrice(20.0f);
		book2.setPublishYear(2010);
		books.add(book2);
		// books.add(new Book("Javascript"));
		// System.out.println(books);
		// books.remove(1);
		System.out.println(books);
		/*//ctrl+Shift+/
		 * Iterator<Book> it=books.iterator(); // while (it.hasNext()) { // Book book
		 * =it.next(); // if (book.getTitle().contains("Learn")) { //
		 * System.out.println(book); // } // }
		 */
		books.sort(new Comparator<Book>() {

			@Override
			public int compare(Book book1, Book book2) {
				//return (int)(book1.getPrice()-book2.getPrice());
				return book1.getPublishYear()-book2.getPublishYear();
			}
		});
		System.out.println("After sorting:"+books);
	}

	private static void demo() {
		List<Integer> list = new ArrayList<Integer>();// Generic List
		list.add(1);// adding number 1in list
		list.add(3);
		list.add(5);
		// list.add("Ram");//can be used in List list=new ArrayList(); //not in Generic
		// List
		System.out.println(list);
		list.remove(2); // specified index as 2
		System.out.println(list.contains(3));// checks list has number 3
		System.out.println(list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {// for iterate over collection
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

	}
}
