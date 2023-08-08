import java.util.Scanner;
public class Fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        sc.close();
    
        int firstNum = 0, secondNum = 1;
        System.out.println("Fibonacci Series of " + n + " terms:");
    
        for (int i = 1; i <= n; ++i) {
          System.out.print(firstNum + ", ");
    
       
          int nextTerm = firstNum + secondNum;
          firstNum = secondNum;
         secondNum = nextTerm;
        }
      }
    
}
