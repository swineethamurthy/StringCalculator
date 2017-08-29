package sCalculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void addTwoStrings() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("1", "2");
		Assert.assertEquals("3", sum);
	}

	@Test
	public void isFirstNumberEmpty() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("", "2");
		Assert.assertEquals("2", sum);
	}

	@Test
	public void isSecondNumberEmpty() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("1", "");
		Assert.assertEquals("1", sum);
	}

	@Test
	public void isFirstNumberNull() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums(null, "2");
		Assert.assertEquals("2", sum);
	}

	@Test
	public void isSecondNumberNull() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("1", null);
		Assert.assertEquals("1", sum);
	}

	@Test
	public void isFirstNumberNegative() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("-4", "2");
		Assert.assertEquals("2", sum);
	}

	@Test
	public void isSecondNumberNegative() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("1", "-3");
		Assert.assertEquals("1", sum);
	}

	@Test(expected = RuntimeException.class)
	public void isFirstInputAValidNumber() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("abc", "-3");
		Assert.assertEquals("0", sum);
	}
	

	@Test(expected = RuntimeException.class)
	public void isSecondInputAValidNumber() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("1", "xyz");
		Assert.assertEquals("0", sum);
	}
	

	@Test
	public void isFirstInputALongNumber() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("2147483641", "3");
		Assert.assertEquals("2147483644", sum);
	}

	
	@Test
	public void isSecondInputALongNumber() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("1", "214748364");
		Assert.assertEquals("214748365", sum);
	}


	/*
	
 * @Test(expected=RuntimeException.class) public void
	 * isFirstInputAMaxLongNumber() { StringCalculator sCalc = new
	 * StringCalculator(); String sum = sCalc.addTwoNums("2147483648", "3");
	 * Assert.assertEquals("3", sum); }
	 * 
	 * @Test(expected=RuntimeException.class) public void
	 * isSecondInputAMaxLongNumber() { StringCalculator sCalc = new
	 * StringCalculator(); String sum = sCalc.addTwoNums("1", "21474836479");
	 * Assert.assertEquals("1", sum); }
	 */
	
	@Test
	public void isFirstNumberADecimal() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("2.45", "3");
		Assert.assertEquals("5", sum);
	}

	@Test
	public void isSecondNumberADecimal() {
		StringCalculator sCalc = new StringCalculator();
		String sum = sCalc.addTwoNums("1", "3.75");
		Assert.assertEquals("4", sum);
	}

	@Test
	public void multiplyTwoStrings() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("1", "2");
		Assert.assertEquals("2", product);
	}
	
	@Test
	public void isFirstNumberEmptyWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("", "2");
		Assert.assertEquals("0", product);
	}

	@Test
	public void isSecondNumberEmptyWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("1", "");
		Assert.assertEquals("0", product);
	}

	@Test
	public void isFirstNumberNullWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums(null, "2");
		Assert.assertEquals("0", product);
	}

	@Test
	public void isSecondNumberNullWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("1", null);
		Assert.assertEquals("0", product);
	}
	
	@Test
	public void isFirstNumberNegativeWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("-4", "2");
		Assert.assertEquals("0", product);
	}

	@Test
	public void isSecondNumberNegativeWhileMultiplying() {
		dStringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("1", "-3");
		Assert.assertEquals("0", product);
	}

	@Test(expected = RuntimeException.class)
	public void isFirstInputAValidNumberWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("abc", "-3");
		Assert.assertEquals("0", product);
	}
	

	@Test(expected = RuntimeException.class)
	public void isSecondInputAValidNumberWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("1", "xyz");
		Assert.assertEquals("0", product);
	}
	

	@Test
	public void isFirstInputALongNumberWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("2147483641", "1");
		Assert.assertEquals("2147483641", product);
	}

	
	@Test
	public void isSecondInputALongNumberWhileMultiplying() {
		StringCalculator sCalc = new StringCalculator();
		String product = sCalc.multiplyTwoNums("1", "214748364");
		Assert.assertEquals("214748364", product);
	}


}
