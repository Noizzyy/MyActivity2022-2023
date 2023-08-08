import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElement {
    //Eayy, Peasy!(B)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // Instantiated a scanner object
        ArrayList<String> names = new ArrayList<>();                // Initialized an ArrayList
        names.add("Richard");
        names.add("Ashton");
        names.add("Hailey");
        names.add("Yurina");
        names.add("Judith");

        while (names.size() > 0) {                                  // A while loop that tells the program to repeat until the array list is empty
            System.out.print("Updated Elements: ");
            for (int i = 0; i <= names.size() - 1; i++) {           // A for loop that tells the program to display the current array elements
                System.out.print(names.get(i) + ", ");
            }
            System.out.print("\n\nInput: ");
            int input = sc.nextInt();

            System.out.println("Output:");
            System.out.println(names.get(input - 1) + " deleted");  // A print statement that displays which element was removed

            names.remove(input - 1);                                // A remove method used to remove elements in the array list
        }
    }		// There's some error that we've encountered here			
}