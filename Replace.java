import java.util.Scanner;
public class Replace {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    String input = sc.next();
    String replace = input.replace("a", "b");
    System.out.println(replace);
  }
}
