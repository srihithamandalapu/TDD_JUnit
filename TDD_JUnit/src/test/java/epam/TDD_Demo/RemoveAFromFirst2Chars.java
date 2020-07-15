package epam.TDD_Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFromFirst2Chars {

	RemoveChars obj;
	
	@BeforeEach
	void create() {
		 obj = new RemoveChars();
	}
	
	@Test
	void test_1() {
		
		String res = obj.remove_A("AASHI");
		assertEquals("SHI",res);
		
	}
	@Test
	void test_2() {
		String res = obj.remove_A("APPLE");
		assertEquals("PPLE",res);
		
	}
	@Test
	void test_3() {
		String res = obj.remove_A("BALL");
		assertEquals("BLL",res);
	}
	
	@Test
	void test_4() {
		String res = obj.remove_A("HYD");
		assertEquals("HYD",res);
	}
	
	
}
