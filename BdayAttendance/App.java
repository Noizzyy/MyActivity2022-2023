import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // Instantiated a scanner object

    // Easy, Peasy! (A)

    System.out.print("Enter your Name: ");
    String name = scan.nextLine(); // Reads user's input

    System.out.println("\nMerry Christmas! " + name); // Output of user's input
    System.out.println(); // Throws cursor to the next line

    // Beginning of Upper Part
    int i = 0; // Post-increment of variable i
    while (i < 7) { // A while loop that tells the program to continue if the variable i is less than 7.
      int j = 0; // Initialization of variable j and k
      int k = 0;
      while (j < 7 - i) { // A while loop that tells the program the position of the tree (upper part)
        System.out.print(" "); // Print spaces
        j++; // Post-increment of variable j
      }
      while (k < (2 * i) + 1) { // A while loop that tells the program how many stars (*) will print in each line
        System.out.print("*");
        k++; // Post-increment of variable i
      }
      i++; // Post-increment of variable i
      System.out.println("");
    }
    // End of Upper Part

    // Beginning of Lower Part
    int l = 1; // Initialization of variable l
    while (l <= 2) { // A while loop that tells the program to continue if the variable i is less than or equal to 2
      int m = 6; // Initialization of variable m and n
      int n = 3;

      while (m > 0) { // A while loop that tells the program to center the lower part of the tree
        System.out.print(" ");
        m--; // Post-decrement of variable m
      }
      while (n > 0) { // A while loop that tells the program how many stars (*) will print in each line
        System.out.print("*");
        n--; // Post-decrement of variable n
      }
      l++; // Post-increment of variable l
      System.out.println(" ");
    }
    // End of Lower Part

  }
}
