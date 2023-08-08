import java.util.Scanner;
import CLASSPACK.*; 
public class mainActivity1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("----------------------MACHINE PROBLEM 1---------------------------");
        // System.out.print("Enter your name: ");
        // String pangalan = sc.nextLine();
        // System.out.print("Enter your age: ");
        // int edad = sc.nextInt();
 
        // sc.close();
 
        // Tao objTao = new Tao(pangalan, edad);
        // System.out.println(objTao.getPangalan() + " is " + objTao.getEdad() + " years old.");

        // System.out.println("----------------------MACHINE PROBLEM 2---------------------------");
        // System.out.print("Enter animal Type: ");
        // String type = sc.nextLine();
        // System.out.print("Enter animal Name: ");
        // String name = sc.nextLine();
        // System.out.print("Enter animal bread: ");
        // String bread = sc.nextLine();

        // Animal objAnimal = new Animal (type, name, bread);
        
        // System.out.println("Hi, my name is, " + objAnimal.getName() + " I'm a " + objAnimal.getType() + " and my bread is " + objAnimal.getbread());

        // System.out.println("----------------------MACHINE PROBLEM 3---------------------------");
        // Employee employee = new Employee();
 
        // System.out.print("Name: ");
        // employee.setName(sc.nextLine());
        // System.out.print("Enter Job title: ");
        // employee.setjobTitle(sc.nextLine());
        // System.out.print("Enter numbers of day present (if you have a half day please indicate it as .5): ");
        // employee.setnumOfAttendance(sc.nextDouble());
        // System.out.print("Enter base salary: ");
        // employee.setsalary(sc.nextDouble());
 
        // sc.close();
 
        // System.out.print("Updated Salary = ");
        // System.out.print(employee.Computation());

        // System.out.println("----------------------MACHINE PROBLEM 4---------------------------");
        // Circle circle = new Circle();
 
        // System.out.print("Enter Radius: ");
        // circle.setRadius(sc.nextDouble());
        // sc.close();
 
        // System.out.println("\nArea: " + circle.Area());
        // System.out.println("Circumference: " + circle.Circum());

         // System.out.println("----------------------MACHINE PROBLEM 5---------------------------");
         trafficLight tl = new trafficLight();
         System.out.print("Color: ");
         tl.setColor(sc.next());
         sc.close();
  
         tl.checkLight();

    }
}
