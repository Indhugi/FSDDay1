
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("IBM");
		sb.append(",Bangalore");
		System.out.println(sb);
		System.out.println(sb.charAt(3));
		System.out.println(sb.indexOf("B"));	//First Occurrence
		System.out.println(sb.lastIndexOf("B"));	//Last Occurrence
		
		String str=new String("IBM,Bangalore");
		String str1=new String("IBM,Bangalore");
		System.out.println(str==str1);//false becoz it is two different objects and will compare reference values. 
		System.out.println(str==sb.toString());//false becoz
		
		
	}
}
