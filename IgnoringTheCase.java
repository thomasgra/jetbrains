import java.util.Scanner;

public class IgnoringTheCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    String input = sc.next();
    boolean funkar = input.startsWith("J");
    boolean funkarGemen = input.startsWith("j");
    System.out.println(funkar || funkarGemen);
  }
}
