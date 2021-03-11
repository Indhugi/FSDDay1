
public class VarargsDemo {
	public static void main(String[] args) {
		int result=add("Jay",2,3,4,5,6,7);
		System.out.println(result);
	}
	static int add(String name,int...numbers) {	//varargs //(Must be the last argument)
		int sum=0;
		for (int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		//System.out.println(numbers[1]);
		return sum;
	}
}

class Book{
	private String genre;
	private Author[] authors;
	Book(){
		authors=new Author[3];
	}
	class Author{
		String name;
		String email;
	}
}