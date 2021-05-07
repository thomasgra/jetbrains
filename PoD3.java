import java.util.Scanner;
public class PoD3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int a = sc.nextInt();
       System.out.println((a % 100) / 10);
       boolean b1 = true;
       boolean b2 = false;
       boolean b3 = b1 && b2;
       System.out.println(b3);
       int n = 1000;
       boolean result = (n < 100) || (n >= 200);
  }
}
