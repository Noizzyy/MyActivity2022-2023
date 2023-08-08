package secondproject;

import java.util.Scanner;

public class Attendance {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 			
        // scanner object
        int[] arr = {15, 30, 19, 25, 30, 45}; 
		//first is to initialized an array

		int sum = 1; 									
		// The array's index was used to initialize the sum. This is used to determine whether the program should continue or be terminated.
        while (sum > 0) { 
			//The program will continue if the sum is greater than zero.								
			sum -= sum; 
			// And the if the sum is zero it will reset.								
            System.out.print("\nEnter a number to delete: ");
            int num = scan.nextInt();
            
			if (num == 15 || num == 19 || num == 25 || num == 30 || num == 45) {

				for (int i = 0; i <= arr.length - 1; i++) {
					if (arr[i] == num) {
						arr[i] -= arr[i];
					}
					sum += arr[i];
				}
					if (sum != 0) {		 // This condition used to contineu or end the program.								
						System.out.print("\nNew List: ");
					}
				
				for (int i = 0; i <= arr.length - 1; i++) {		
					if (arr[i] == num) {
						//An if condition that is used to set the Array element that corresponded to the user's input to zero.			
						arr[i] -= arr[i];
					}
					if (arr[i] != 0) {	
						//This condition is used to skip any Array elements that have been changed to zero.						
						System.out.print(arr[i] + " ");
					}
					sum += arr[i];
					//	operator adds the size array to computes the sum of the array's size							
				}
				if (sum == 0) {
					System.out.println("\nArray is Empty");
					// When the user's input did not match any Array element, an else condition was used to print "Error."
				}
			} else {												
				sum += 1;				
			}
        }
    }
}

