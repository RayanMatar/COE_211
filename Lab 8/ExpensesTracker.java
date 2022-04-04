import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.File;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string

	FileWriter fw = new FileWriter(new File("expenses.txt"));
	String a = null;
	Scanner scan = new Scanner(System.in);

      // Start gathering information inside the loop you will start

	do {
	System.out.println("Input your name: ");
	String name = scan.nextLine();
	System.out.println("What did you purchase? ");
	String purchase = scan.nextLine();
	System.out.println("How much did you pay? (in USD) ");
	double amount = scan.nextDouble();
	scan.nextLine();

	fw.write(name + " purchased " + purchase + " for " + amount + " US Dollars. ");

	System.out.println("Would you like to log another purchase? (y/n)");
	a = scan.nextLine();
	} while(a.equals("y"));

      // Close ClassWriter & Scanner objects

      scan.close();
	fw.close();
        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again
  }
}
