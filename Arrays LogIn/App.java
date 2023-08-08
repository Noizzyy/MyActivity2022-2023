package secondproject;

import java.util.Scanner;

public class App {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 			
        
        int[] Array = {15, 30, 19, 25, 30, 45}; 		
		int sum = 1; 									
    
        while (sum > 0) { 								
			sum -= sum; 								
            System.out.print("\nEnter a number to delete: ");
            int input = scan.nextInt();
            
			if(sum != -1) {
				System.out.print("New List: ");
				for (int i = 0; i <= Array.length - 1; i++) {		
					if (Array[i] == input) {						
						Array[i] -= Array[i];
					}
					if (Array[i] != 0) {							
						System.out.print(Array[i] + " ");
					}
					sum += Array[i];								
				}									
			}
        }
    }
}
