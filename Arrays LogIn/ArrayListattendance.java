package secondproject;

import java.util.ArrayList;

public class Arraylist {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(15);
    myNumbers.add(30);
    myNumbers.add(25);
    myNumbers.add(19);
    myNumbers.add(19);
    myNumbers.add(30);
    myNumbers.add(40);

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
