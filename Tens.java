import java.util.Scanner;
public class Tens {
  public static void main(String args []) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int a = sc.nextInt();
    if (a <= 1000000) {
      System.out.println((a % 100) / 10);
    }
  }
}
