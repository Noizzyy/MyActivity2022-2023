package secondproject;

import java.util.Scanner;

public class Attendancenotes {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 			 							// instantiated a scanner object
        int[] arr = {15, 30, 19, 25, 30, 45}; 									    // declaration and initialization of an array and the sum of the array (to identify whether the program will continue)
		int sum = 1; 

        while (sum > 0) { 															//  a while loop that tells the program to continue if the sum is greater than zero.								
			sum -= sum; 															// resets the sum counter back to zero								
            System.out.print("\nEnter a number to delete: ");
            int num = scan.nextInt();
            
			if (num == 15 || num == 19 || num == 25 || num == 30 || num == 45) {

				for (int i = 0; i <= arr.length - 1; i++) {							// a for loop to loop through the array elements
					if (arr[i] == num) {											// an if condition used to convert to zero the array element that matched the user's input
						arr[i] -= arr[i];
					}
					sum += arr[i];													// computes the sum of the size of the array
				}
					if (sum != 0) {		 											// an if condition used to print "New List: " if the program continues								
						System.out.print("\nNew List: ");
					}
				
				for (int i = 0; i <= arr.length - 1; i++) {		
					if (arr[i] == num) {											// an if condition used to set the Array element that corresponded to the user's input to zero.			
						arr[i] -= arr[i];
					}
					if (arr[i] != 0) {												// an if condition used to skip any Array elements that have been changed to zero.						
						System.out.print(arr[i] + " ");
					}
					sum += arr[i];													// computes the sum of the size of the array							
				}
				if (sum == 0) {
					System.out.println("\nArray is Empty");						// an if condition used to print "Array is empty" when the program ends
					System.out.println("");
					System.out.println("\nProgram ends...");
				}
			} else {																// an else condition used to print "Error! no element found" if the user's input did not matched and array element in the list.
				System.out.println("\nError! No element found");			
				sum += 1;															// adds 1 to the sum to prevent the program to stop	
			}		
        }
    }
}
