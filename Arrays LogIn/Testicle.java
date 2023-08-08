package secondproject;

import java.util.Scanner;

public class Testicle {

    public static void main(String[] args) {

        int[] testestosterone = {15, 30, 25, 19, 30, 40};

        Scanner scan = new Scanner(System.in);

        String Status = "Not Done";

        while (Status == "Not Done") {
            System.out.print("Enter a number to delete: ");
            int input = scan.nextInt();
            
            System.out.println("New List:");
            for (int i = 0; i < testestosterone.length; i++) {
                if (testestosterone[i] != input) {
                    System.out.println(testestosterone[i
                    ]);
                }
            }



        }
    }
}

