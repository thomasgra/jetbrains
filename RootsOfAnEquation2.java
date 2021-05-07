import java.util.Scanner;

// Input two numbers and find the roots (if there are any). Ex y = 2x - 1
// the code needs to check wich x value makes the equation equals to 0.
public class RootsOfAnEquation2 {
  public static void main(String[] args) {

    // Create a new scanner
    Scanner sc = new Scanner(System.in);

    System.out.print("Input: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

// int y =  (a * (x)) + b;
// System.out.println(y);
    for (int x = 0; x <= 10; x ++) {

     int noll =  (a * (x)) + b;
     if (noll == 0) {
     System.out.println(noll);
  }
  }

  }
}
