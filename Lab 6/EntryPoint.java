import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
		int service;
	 String a = null;
		 Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Which service would you like to use? \n" +
					"[1]: Basic week visualizer \n" +
					"[2]: Advanced week visualizer \n" +
					"[3]: Basic calculator \n" +
					"[4]: Employee repertoire"); 
			service = scan.nextInt();
		 

		if(service == 1) {
			BasicWeek basc = new BasicWeek();
			basc.printDays();
			System.out.println("Would you like to perform another operation? (y/n) ");
			a = scan.next();
		}
		else if(service == 2) {
			AdvancedWeek adv = new AdvancedWeek();
			adv.printDays();
			System.out.println("Would you like to perform another operation? (y/n) ");
			a = scan.next();
		}
		else if(service == 3) {
			Calculator calc = new Calculator();
			System.out.println("Would you like to perform another operation? (y/n) ");
			a = scan.next();
		}
		else if(service == 4) {
			Employee emp = new Employee();
			System.out.println("Employee information: " + emp.toString());
			System.out.println("Would you like to perform another operation? (y/n) ");
			a = scan.next();
		} else {
		a = "y"; 
		System.out.println("Please make sure you pick a number between 1 and 4");
		}
		
		}while (a.equals ("y"));
    }
}