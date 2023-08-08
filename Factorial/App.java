import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

public class app {
	// ------------------------------------------------------------------------- || Variables || ------------------------------------------------------------------------- \\
	static boolean 	demo 			= false;
	static boolean 	inputComplete 	= false;
	static boolean 	containsDigit 	= false;
	static boolean	loggerFirstPass	= true;
	static int 		attempt			= 0;
	static int		lineToEdit 		= 11;
	static int		truePermutation	= 0;
	static String 	input 			= "";
	static String 	log 			= "";
	static String 	fileName 		= System.getProperty("user.dir") + "\\src\\History.txt";
	static String	javaFileName	= System.getProperty("user.dir") + "\\src\\app.java";
	static String	newLine			= "	static int 		attempt			= " + (attempt + 1) + ";";
	static LocalDateTime now = LocalDateTime.now();
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------- \\
	
	// -------------------------------------------------------------------------- || Methods || -------------------------------------------------------------------------- \\
		
		// The user input must not contain a number,
		// and so, the function of this method is to
		// verify the input if it contains a number.
	static void checkInputForNumber(String str) {					// Called from line 153, the value of the parameter sent comes from the value of input.
		char[] chars = str.toCharArray();								// Converts String input into an array of characters.
		for (char c : chars) {											// For loop that iterates through all of the array chars elements.
			if (Character.isDigit(c)) {									// An if condition that turns boolean containsDigit to true if a character from chars array is digit.
				containsDigit = true;
			}
		}
	}
	
		// A recursive method that computes
		// the factorial of the length of the
		// given input.
	static long factorial(long n) {									// Called from line 166 and 168, the value of the parameter sent comes from the length of the input.
		if (n <= 1) {													// if condition that returns 1 if the value of n is less than or equal to 1.
			return 1;
		} else {														// else condition that returns n multiplied by recursive factorial method call with parameter of n - 1.
			return n * factorial(n - 1);
		}
	}
	
		// This method stores the output into a log
		// variable in which is then used later on
		// to be printed in the terminal and stored
		// in the history log.
	static void outputLogger(long result, String str) throws IOException {			// Called from line 166 and 168, the value of the first parameter(result) comes from the factorial if the input length. The second parameter(str) comes from the value of the user input.
		if (loggerFirstPass == true) {									// if the result is equal to 1, it returns "permutation" (without 's')
			if (result == 1) {
				log = "Attempt: " + attempt + " | " + now + "\n\nInput: " + str + "\nFactorial: " + result + "\nPossible permutation: ";
			} else {													// else if the result is greater than 1, it returns "permutations" (with 's')
				log = "Attempt: " + attempt + " | " + now + "\n\nInput: " + str + "\nFactorial: " + result + "\nPossible permutations: ";
			}
			loggerFirstPass = false;
		} else {
			if (factorial(input.length()) != truePermutation)
				log = log + "\n\nThe factorial of " + input.length() + " is " + factorial(input.length()) + ", but, the possible permutation of " + str + " is only " + truePermutation;
		}
	}
	
		// This method is used in order to get all of the
		// distinct combination/permutation of the given input.
	static void printDistinctPermutn(String str, String ans) {		// Called from line 167. The value of the first parameter(str) comes from the input. The value of the second parameter(ans) is an empty string which will be modified by the method.
		if (str.length() == 0) {										// After the ros goes through serial combinations, the length of str becomes zero
            log = log + ans.toUpperCase() + " ";      					// in which the gathered combinations stored in ans is then added to the log.
            truePermutation += 1;
            return;
        }
 
        boolean alpha[] = new boolean[26];								// Make a boolean array of size '26' which stores false by default and make true at the position which alphabet is being used.
 
        for (int i = 0; i < str.length(); i++) {
 
            char ch = str.charAt(i);									// Itherates through all of the characters in str.
 
            String ros = str.substring(0, i) + str.substring(i + 1);	// Rest of the string after excluding the itherated character.
            
            if (demo == true) {											// for demo purposes only.
            	 System.out.print("i: " + i + "\tstr length: " + str.length() + "\tros: " + ros + "\tans: " + ans + "\tch: " + ch + "\n");
            }
 
            if (alpha[ch - 'a'] == false) 								// If the character has not been used, then recursive call will take place.
            		printDistinctPermutn(ros, ans + ch);				// Otherwise, here will be no recursive call.
            alpha[ch - 'a'] = true;
        }
	}
	
		// This method is used to print the log
		// to the history.txt file.
	static void appendStrToFile(String str) {						// Called from line 171. The value of the parameter comes from the input.
		File historyLog = new File(fileName);							// Instantiated a new file object.
		if (!historyLog.exists()) {										// An if condition that checks if the specified file do exist.
			try {														// If not, then it will execute createNewFile method which will then create the file.
				historyLog.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw = new FileWriter(historyLog, true);			// Instantiated a FileWriter object that has the historyLog File and parameter "true" to tell the FileWriter to go on append mode.
			BufferedWriter bw = new BufferedWriter(fw);					// Instantiated a bufferedWriter to optimized the writing operation.
			
			bw.write(log + "\n");
			bw.newLine();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
		// This method is used to edit line 10
		// in order to keep track the amount of
		// attempts.
	static void attemptCounter() {														// Called from line 165. This method is called first so that it could adjust the attempt count before the programs starts making logs.
		try {
			List<String> lines = new ArrayList<>();											// Created new arraylist in which the old java file will be temporarily saved and copied onto the new java file.
			BufferedReader reader = new BufferedReader(new FileReader(javaFileName));		// Reads the java file line by line. FileReader reads letter by letter, Buffered reader reads in chunks.
			String line;
			
			while ((line = reader.readLine()) != null) {									// The while loop will keep iterating as long as the reader still has lines to read.
				lines.add(line);															// The reader reads the file line by line and temporarily saves it onto line which is then accumulated on lines
			}
			reader.close();
			
			attempt += 1;																	// Increments attempt by 1
			lines.set(lineToEdit - 1, newLine);												// then replaces the specified line with newLine.
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(javaFileName));		// Instantiated new BufferedWriter
			for (String s : lines) {														// Reads the accumulated contents on lines and add it to s which is then printed to the java file.
				writer.write(s);
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------- \\
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (inputComplete == false) {
			System.out.print("Enter a random set of letters: ");
			input = sc.next();
			System.out.println();
			
			checkInputForNumber(input);								// Na sa line 27
			
			if (containsDigit != true) {
				inputComplete = true;
				sc.close();
			} else {
				System.out.println("Oops! Please do not include a number on your input\n");
				containsDigit = false;
			}
		}
		
		try {
			attemptCounter();										// Na sa line 119
			outputLogger(factorial(input.length()), input);			// outputLogger na sa line 51 | factorial na sa line 39
			printDistinctPermutn(input.toLowerCase() , "");			// Na sa line 67
			outputLogger(factorial(input.length()), input);			// outputLogger na sa line 51 | factorial na sa line 39
			System.out.println(log);
			
			appendStrToFile(input);									// Na sa line 94
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
