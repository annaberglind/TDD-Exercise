package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void Emptystring(){
		assertEquals(0,Calculator.add(""));
	}

	@Test
	public void onestring() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void twostrings() {
		assertEquals(3, Calculator.add("1,2"));
	}



}
