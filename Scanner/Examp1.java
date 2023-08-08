import java.util.Scanner;
public class Examp1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input any Intergers.");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(n + sum);
    }
}


