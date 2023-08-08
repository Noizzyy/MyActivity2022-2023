package secondproject;

public class firstapp {

  public static void main(String[] args) {
    // int x = 3;
    // int y = x--;

    // y+= ++x; //x=x+3

    // System.out.println("The value of x "+ x);
    // System.out.println("The value of y "+y);

    // for(int i=0; i<3; i++){
    //     for(int j=3; j<10; j++)
    //     System.out.print("Apple");
    //     System.out.println("PIE");
    // }
    int i = 0;
    int j = 7;

    while (i < 3) {
      while (j < 10) {
        System.out.print("Apple");
        j += 1;
    }
        System.out.println("PIE");
        i += 1;
        j -= 3;
    }
  }
}
