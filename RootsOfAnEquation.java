import java.util.Scanner;

// Input four number and find the roots (if there are any)
// the code needs to check wich x value makes the equation equals to 0.
public class RootsOfAnEquation {
  public static void main(String[] args) {

    // Create a new scanner
    Scanner sc = new Scanner(System.in);

    System.out.print("Input: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();


    for (int x = 0; x <= 1000; x ++) {

      int root =  (a * (x * x * x)) + (b * (x * x)) + (c * (x)) + d;
      if (root == 0) {
        System.out.println(x);
      }
    }
  }
}
