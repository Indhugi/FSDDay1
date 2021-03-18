import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBug {

	@Test
	void testBugIDasNegative() {
		Bug bug =new Bug();
		Exception exception=assertThrows(IllegalArgumentException.class,()->{
		bug.Add(-1,PRIORITY.LOW,"OP",STATUS.OPEN);
		});
	}
	
	@Test
	void testBugIDasZero() {
		Bug bug =new Bug();
		Exception exception=assertThrows(IllegalArgumentException.class,()->{
		bug.Add(0,PRIORITY.LOW,"OP",STATUS.OPEN);
		});
	}
}
