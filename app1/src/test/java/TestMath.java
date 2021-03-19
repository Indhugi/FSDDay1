import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestMath {
	Math math;
	@BeforeEach
	void init() {
		math=new Math();
	}
	
	@Test
	void testAdd() {
		int result=math.add(1,2,3);
		assertEquals(6, result);
		
	}
	@Test
	void testAddwithNegativeNumbers() {
		int result=math.add(-1,-2,-3);
		assertEquals(-6, result);
		
	}
	@Test
	void TestMultiply() {
		int result=math.multiply(1,2,3);
		assertEquals(6, result);
	}
//	@Test
//	void TestMultiplywith1Negative() {
//		Exception exception=assertThrows(IllegalArgumentException.class,()->{
//		math.multiply(-1,5);
//	});
//	}
//	@Test
//	void TestMultiplywith2Negative() {
//		int result=math.multiply(-5,-5);
//		Assert.assertEquals(25, result);
//	}
	@Test
	void TestMultiplywithZero() {
		int result=math.multiply(0,4);
		assertEquals(0, result);
	}
}
