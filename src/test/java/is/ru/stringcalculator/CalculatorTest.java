package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void Emptystring(){
		assertEquals(0,Calculator.add(""));
	}

	@Test
	public void onenumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void twonumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void multiplenumbers() {
		assertEquals(6,Calculator.add("1,2,3"));
	}



}
