import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int[] assignments = new int[5];
	int midterm ;
	int attendences;
	int grade;
	int totalAssignments = 0;


	for(int x = 1; x < 6; x++) {
	System.out.println("Input the grade for asssignment " + x);
	assignments[x-1] = scan.nextInt();
	} 

	for(int a = 0; a < 5; a++) {
	totalAssignments += assignments[a];
	}
	totalAssignments /= 5;
	totalAssignments *= 0.3;

	System.out.println("Input the number of attended labs");
	attendences = scan.nextInt();
	attendences *= 100/7;
	attendences *= 0.05;
	
	System.out.println("Input the midterm grade");
	midterm = scan.nextInt();
	midterm *= 0.3;
        
	System.out.println("Assignments(30%): " + totalAssignments);
	System.out.println("Attendance(5%): " + attendences);
	System.out.println("Midterm(30%): " + midterm);
	
    }
}