import Classpack2.*;
import java.util.Scanner;

public class Mainsecondq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        
        System.out.print("Enter '1' for rectangle area or '2' for triangle area: ");
        int choice = sc.nextInt();

        sc.close();

        Shape shape;
        if (choice == 1) {
            shape = new Rectangle();
        } else if (choice == 2) {
            shape = new Triangle();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        shape.setValues(height, width);
        double area = shape.getArea();
        System.out.println("Area: " + area);
    }
}
