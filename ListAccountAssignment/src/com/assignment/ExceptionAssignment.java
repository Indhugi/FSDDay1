package com.assignment;

public class ExceptionAssignment extends Throwable {
	public static void main(String[] args) {
//		int a=100;
//		if (a==100) {
//			throw new ArithmeticException("A is 100");
		try {
			int[] numbers= {2,4,7};
			System.out.println(numbers[5]);
		}catch(Exception e) {
			System.out.println("Array index out of bound");
		}finally {
			System.out.println("Finally of try catch");
		}
	}
}
