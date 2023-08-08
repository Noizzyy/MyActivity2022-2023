import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Apptwo {   

	 // declaring of static variables
    static String input = "";  
    static String newnameString = "";     
    static boolean Wordfound = false;
    static String filestring = "C:\\School Files\\1st year_2ndSemester\\CCPRGG2L_PROGRAM\\Attendance\\src\\name.txt"; //file location       
    

    public static void main(String[] args) {// a method to display if the input is not found/invalid
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");	// reads the input
        String input = sc.nextLine();

        finder(filestring, input);    // finder method

        if (Wordfound == true) {					// 
            System.out.print("New word: ");
            String newnameString = sc.nextLine();

            modifyFile(filestring, input, newnameString, input);

            System.out.println("Output:");
            output();
        }
        else {
            System.out.println("<Invalid Text>\nOutput:");		// an else statement used to print "Invalid Text" if the input is not in the file
            output();
        }
        sc.close();
    }

    static void modifyFile(String filePath, String previousString, String newString, String input) {			// method new name
    	
        File fileToBeModified = new File(filePath);    
        String Name = "";
        BufferedReader reader = null;
        FileWriter writer = null;
         
        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
             
            while (line != null) {                                             // a while loop that reads all of the text file lines and writes them to Name
                Name = Name + line + System.lineSeparator();
                line = reader.readLine();
            }

            String newnameString = Name.replaceAll(previousString, newString);	 
            writer = new FileWriter(fileToBeModified);                           	 // rewriting the input text file with newContent
            writer.write(newnameString);
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();             				// closing the resources
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static void finder(String filePath, String input) {																                      
        try {
            File readerObj = new File(filePath);
            Scanner Reader = new Scanner(readerObj);			

            while (Reader.hasNextLine()) {               // a while loop that reads the file line by line and checks to see if the input word is present.
                String data = Reader.nextLine();                													
                if (data.equals(input)) {		// an if statement informing the program that if the input word exists in the file, the variable "Wordfound" becomes true
                    Wordfound = true;
                }
            }
            Reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

    static void output() {																							                                   
        try {
            File readerObj = new File(filestring);
            Scanner Reader = new Scanner(readerObj);

            while (Reader.hasNextLine()) {                       	// a while loop used to output the file's elements line by line
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}