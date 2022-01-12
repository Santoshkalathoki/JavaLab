// Java Program to add an element in an Array 
import java.util.*; 
public class Qn032{ 

	// Function to add new item in arr 
	public static int[] addX(int n, int arr[], int x) 
	{ 
		int i;
		// create a new array of size n+1 
		int newarr[] = new int[n + 1]; 

		// insert the elements from 
		// the old array into the new array 
		// insert all elements till n 
		// then insert x at n+1 
		for (i = 0; i < n; i++) 
			newarr[i] = arr[i]; 

		newarr[n] = x; 

		return newarr; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		int n = 10; 
		int i; 
		Scanner input = new Scanner(System.in);
		// initial array of size 10 
		int arr[] ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 

		// print the original array 
		System.out.println("\nInitial Array:\n" + Arrays.toString(arr)); 

		// element to be added 
		System.out.print("\nEnter the new element for array: ");
		int x = input.nextInt();

		// call the method to add x in arr 
		arr = addX(n, arr, x); 

		// print the updated array 
		System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr)); 
	} 
} 
