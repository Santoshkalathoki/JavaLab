//program to print n1 to n2
import java.util.Scanner;
public class Qn008{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			System.out.println(i);
		}
	}
}