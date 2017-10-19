package tdd.assignment3.part3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanToArabicTest {

	@Test
	public void testForConvert_I_To_1() {
		assertEquals(new Roman("I").toArabic(),1);
	}

	@Test
	public void testForConvert_II_To_2() {
		assertEquals(new Roman("II").toArabic(),2);
	}
	

	@Test
	public void testForConvert_V_To_5() {
		assertEquals(new Roman("V").toArabic(),5);
	}
	@Test
	public void testForConvert_X_To_10() {
		assertEquals(new Roman("X").toArabic(),10);
	}
	@Test
	public void testForConvert_III_To_3() {
		assertEquals(new Roman("III").toArabic(),3);
	}
	@Test
	public void testForConvert_IV_To_4() {
		assertEquals(new Roman("IV").toArabic(),4);
	}
	@Test
	public void testForConvert_VI_To_6() {
		assertEquals(new Roman("VI").toArabic(),6);
	}
	@Test
	public void testForConvert_VII_To_7() {
		assertEquals(new Roman("VII").toArabic(),7);
	}
}
	
	
	
	