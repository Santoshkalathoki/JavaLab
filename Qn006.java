//Write a program which demonstrates the use of nested switch statement.
import java.util.Scanner;
public class Qn006{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("1. Separate Information\n2. Combined Information");
		System.out.println("\nEnter a choice to display information(1/2): ");
		int choice1 = input.nextInt();
		switch(choice1)
		{
			case 1:
				System.out.println("1. Name\n2. Phone No.");
				System.out.println("Enter your choice(1/2)");
				int choice2 = input.nextInt();
				switch(choice2)
				{
					case 1:
						System.out.println("Name : Sajan Kc");
						break;
					case 2:
						System.out.println("Phone No. : 9843337779");
						break;
					default:
						System.out.println("Invalid input");
				}
				break;
			case 2:
				System.out.println("Name: Sajan Kc\nPhone No. : 9843337779");
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}