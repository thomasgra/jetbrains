import java.util.Scanner;

class CheckTheSum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int res1 = a + b;
    int res2 = b + c;
    int res3 = c + a;
    boolean total1 = res1 == 20;
    boolean total2 = res2 == 20;
    boolean total3 = res3 == 20;
    System.out.println(total1 || total2 || total3);
  }
}
