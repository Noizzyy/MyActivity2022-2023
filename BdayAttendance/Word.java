import java.util.Scanner;

public class WordReverse{ 
//Eayy, Peasy!(C)

    static boolean isPalindromic(String word, String reversed) {                // creates boolean method for the Word Reverse
        if (word.equalsIgnoreCase(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                                      // Instantiated a scanner object

        System.out.print("Input word: ");                   
        String word = scan.nextLine();                                              // Read user's input
        String reversed = "";

        for (int i = 0; i < word.length(); i++) {                                   // A for loop that tells the program to reverse the word input
            reversed = word.charAt(i) + reversed;
        } 
        
        if (isPalindromic(word, reversed) == true) {                                // An if condition that tells the program to return the boolean method
            System.out.println("True. It is a PALINDROME");
        } else {
            System.out.println("False. Not a PALINDROME");
        }
    }
}