package application;

public class Model {
	public float calculate(float number1, float number2, String operator) {
		switch (operator) {
		case "+":
			return number1 + number2;
		case "-":
			return number1 - number2;
		case "*":
			return number1 * number2;
		case "/":
			if(number2 == 0)
			return number1 / number2;
		 case "C":
             number1 = 0;
             number2 = 0;
             return 0;
		 case "x^2":
             return number1 * number1;     
		 case "sqrt":
			return (float) Math.sqrt(number1);
		 case "log":
			return (float) Math.toRadians(Math.log(number1));
		 case "cos":
			  return (float)Math.toRadians(Math.cos(number1));
		 case "tan":
			  return (float)Math.tan(number1);	 
		 case "sin":
			  return (float)Math.sin(number1);		  
		 case "pii":
			  return (float)Math.PI;
			  
			default:
				return 0;
		}
	}
}