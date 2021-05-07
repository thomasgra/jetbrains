import java.util.Scanner;

public class Main3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int a = scanner.nextInt();
// System.out.println(a / 100 + 10 * (a / 10 % 10) + 100 * (a % 10));
System.out.print(a / 100);
System.out.print(10 * (a / 10 % 10));
System.out.print(100*(a % 10));



  }
}
