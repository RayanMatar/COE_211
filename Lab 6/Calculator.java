import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    
    public Calculator() {
        
        Scanner scanCalc = new Scanner(System.in);
       
	System.out.print("Input the first number: ");
		int num1 = scanCalc.nextInt();
	
	System.out.print("Input the operator that is : ");
		operator = scanCalc.nextLine();

	System.out.print("Input the second number: ");
		int num2 = scanCalc.nextInt();
	
       
      Switch(Operator){

		case"/":
			System.out.println(devide(num1, num2));
			break;

		case"x":
			System.out.println(multiply(num1, num2));
			break;

		case"+":
			System.out.println(add(num1, num2));
			break;

		case"-":
			System.out.println(substract(num1, num2));
	
	}

    public String add(int a, int b) {
	   
    }

    public String subtract(int a, int b) {
        /**
         * Enter logic
         */
    }

    public String multiply(int a, int b) {
        /**
         * Enter logic
         */
    }

    public String divide(int a, int b) {
        /**
         * Enter logic
         */
    }
}