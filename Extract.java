import java.util.Scanner;
public class Extract {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    String input = sc.next();
    System.out.print("Input 2: ");
    int integerOne = sc.nextInt();
    int integerTwo = sc.nextInt();
    
    System.out.println(input.substring(integerOne, (integerTwo + 1)));
  }
}
