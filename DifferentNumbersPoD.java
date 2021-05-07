import java.util.Scanner;
// Alla inmatade siffror ska vara olika

public class DifferentNumbersPoD {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int res1 = a + b;
    int res2 = b + c;
    int res3 = c + a;
    boolean total1 = a != b;
    boolean total2 = b != c;
    boolean total3 = c != a;
    System.out.println(total1 && total2 && total3);
  }
}
