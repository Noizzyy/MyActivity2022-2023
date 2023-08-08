import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App { //attendance1
    public static void main(String[] args) throws Exception {

        boolean number = false;                              
        String numbersFile = "C:\\School Files\\1st year_2ndSemester\\CCPRGG2L_PROGRAM\\Attendance\\src\\num.txt";//file location
        
        try {
            Scanner sc = new Scanner(System.in);	//  scanner object
            System.out.print("Input: ");			// reads user's input
            String input = sc.nextLine();
            sc.close();

            File readerObj = new File(numbersFile);
            Scanner reader = new Scanner(readerObj);
        
            while (reader.hasNextLine()) { // a while loop that reads the numbers file line by line and checks to see if the input is present.
            	String data = reader.nextLine();
            	if (data.equals(input)) { //an if statement that tells the program if the input exists in the file
                    number = true;                    //if it does, the variable "number" is set to true.10
                }
            }
            reader.close();
            System.out.print("Output: ");

            if (number == true) {		 // If the input exists in the file, an if statement prints "Found."
                System.out.print("Found");
            }
            else {	 // if the input does not exist in the file, an else statement that prints "Not Found"
                System.out.println("Not Found");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
