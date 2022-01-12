//Write a program which demonstrate the use of if statement.
//b. Ladder if statement
//import java.util.Scanner;
public class Qn004C{
	public static void main(String[] args){
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter a number to display the name of a day of week: ");
		//int choice = input.nextInt();
		int choice = 4;
		if(choice == 1)
			System.out.println("Sunday");
		else if(choice == 2)
			System.out.println("Monday");
		else if(choice == 3)
			System.out.println("Tuesday");
		else if(choice == 4)
			System.out.println("Wednesday");
		else if(choice == 5)
			System.out.println("Thursday");
		else if(choice == 6)
			System.out.println("Friday");
		else if(choice == 7)
			System.out.println("Saturday");
		else
			System.out.println("Invalid input");
	}
}	