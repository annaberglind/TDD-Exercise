package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){

		if (text.equals("1")){
			return 1;
		}
		else if(text.contains(",")){
			String[] numbers = text.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		}
		else
			return 0;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	
}