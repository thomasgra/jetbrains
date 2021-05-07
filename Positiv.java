import java.util.Scanner;
// Skriver ut YES om siffran är positiv, annars NO
public class Positiv {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int number = sc.nextInt();
    if (number > 0) {
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
}
