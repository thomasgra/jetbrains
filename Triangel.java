import java.util.Scanner;
// Kan en triangel med dessa sidor existera
public class Triangel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input 1: ");
    int a = sc.nextInt();
    System.out.print("Input 2: ");
    int b = sc.nextInt();
    System.out.print("Input 3: ");
    int c = sc.nextInt();
    if (a + b > c && a + c > b && b + c > a) {
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
}
