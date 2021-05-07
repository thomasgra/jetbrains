import java.util.Scanner;

public class IncrementDecrement {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input four numbers: ");
    int a,b,c,d;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    d = scanner.nextInt();
    System.out.print(--a + "\t" + --b + "\t" + --c + "\t" + --d);
    System.out.println();
    char g = '1' + '3';
System.out.println(g);;
  }
}
