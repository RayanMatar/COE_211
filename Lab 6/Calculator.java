import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    
    public Calculator() {
        
        Scanner scanCalc = new Scanner(System.in);
       
	System.out.print("Input the first number: ");
		int num1 = scanCalc.nextInt();

		scanCalc.nextLine();
	
	System.out.print("Input the operator that is : ");
		operator = scanCalc.nextLine();

	System.out.print("Input the second number: ");
		int num2 = scanCalc.nextInt();
	
       
      switch (operator) {

		case "/":
			System.out.println(divide(num1, num2));
			break;

		case "x":
			System.out.println(multiply(num1, num2));
			break;

		case "+":
			System.out.println(add(num1, num2));
			break;

		case "-":
			System.out.println(subtract(num1, num2));
	
	}
}

    public String add (int num1, int num2) {
	  int addition = num1 + num2;
		return num1 + " + " + num2 + " = " + addition; 
    }

    public String subtract (int num1, int num2) {
       int subtract = num1 - num2;
		return num1 + " - " + num2 + " = " + subtract;
    }

    public String multiply (int num1, int num2) {
        int multiply = num1 * num2;
		return num1 + " x " + num2 + " = " + multiply;
    }

    public String divide (int num1, int num2) {
        double divide = num1 /(double) num2;
		return num1 + " / " + num2 + " = " + divide;
    }
}