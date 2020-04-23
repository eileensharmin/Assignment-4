//Eileen Sharmin Assignment 4 ITSS 3311.002
/* Sample Run
 * Enter 5 elements of list1: 
1 2 3 4 5 
Enter 5 elements of list2: 
1 2 3 4 5
The two lists are strictly identical
 */

import java.util.Scanner;

public class StrictlyIdentitcal 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //creates a scanner for numbers to be input
		System.out.println("Enter 5 elements of list1: ");

		int size = 5; //declares a variable that is used in the for loop that will not be >= 5
		
		int[] list1 = new int[5]; //creating an array with 5 spaces
		for(int i=0; i<size; i++) //for loop that will enter items into the array
		{
			list1[i] = input.nextInt(); //enters user-entered values into the array
		}
		
		System.out.println("Enter 5 elements of list2: "); //begins the same process for the second array
		
		int[] list2 = new int[5]; //creating an array with 5 spaces
		for(int i =0; i<size; i++) //for loop that will enter items into the array
		{
			list2[i] = input.nextInt();
		}
		
		if(equals(list1, list2)) //checks if the two arrays are identical 
		{
			System.out.println("The two lists are strictly identical"); //will return this if true
		} else 
			{
				System.out.println("The two lists are not strictly identical"); //will return this if false
			}
		input.close(); //closes the scanner
	}

	public static boolean equals(int[] array1, int[] array2) //passes variables list1 and list2 to array1 and array2
	{
		if(array1.length != array2.length) //if the lengths do not match, return false or else proceed to for loop
		{
		return false;
		}
		
		for(int i=0; i<array1.length; i++) //gets values stored in the arrays to compare them
		{
			if(array1[i] != array2[i]) //if the value at i does not match in either array, return false or else return true
			{
				return false;
			}
			
		}
		 return true;
	}
	
}


