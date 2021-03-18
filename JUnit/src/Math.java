
public class Math {
	int count, sum = 0,product=1;

	public int add(int... numbers) {
		for (int count = 0; count < numbers.length; count++) {
			sum = sum + numbers[count];
		}
		return sum;
	}
	/**
	 * takes 2 number and mulitiply them
	 * @author Indhu
	 */
	int multiply(int... numbers) {
		for (int count = 0; count < numbers.length; count++) {
			if(numbers[count]<0) {
				throw new IllegalArgumentException();
			}
			product=product*numbers[count];				
		}
		return product;
	}
}
//add should take any number of integers and retun sum of it.