//Write a program which demonstrate the use of if statement.
//b. Nested if statement
//import java.util.Scanner;
public class Qn004D{
	public static void main(String[] args){
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter a number: ");
		//int num = input.nextInt();
		int num = -5;
		if(num > 0)
		{
			if(num % 2 == 0)
				System.out.println(num + " is positive even number");
			else
				System.out.println(num + " is positive odd number");
		}
		else
		{
			if(num % 2 == 0)
				System.out.println(num + " is negative even number");
			else
				System.out.println(num + " is negative odd number");
		}
	}	
}	