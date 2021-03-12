package com.ibm;
class Book{
	private String title; 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws MyException {
		if(title==null) {
			throw new MyException();
//			throw new IllegalArgumentException();	//runtime exception
		}
		this.title = title;
	}
	@Override
	public String toString() {
		return this.title;
	}
}
public class Application {
	public static void main(String[] args) {
		Book book=new Book();
		try {
			book.setTitle(null);
		}catch(IllegalArgumentException illegalArg) {
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
		System.out.println(book.toString());//object class function toString explicitly given
//		Book book1=new Book();
//		book1.setTitle("Learnin Javascript");
//		System.out.println(book1);
		
	}
}
