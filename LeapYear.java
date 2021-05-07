import java.util.*;
// Ta reda på om angivet år är skottår
public class LeapYear {
  public static void main(String[] args) {

    // Create a new scanner
    Scanner sc = new Scanner(System.in);

    System.out.print("Input: ");
    int year = sc.nextInt();



    if (year % 4 != 0 && year % 100 == 0 || year % 400 != 0) {
      System.out.println("Regular");
    }
    else {
      System.out.println("Leap");
}
}
}
