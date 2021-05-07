import java.util.Scanner;

class CheckTheValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int value = scanner.nextInt();
    boolean res = value <= 10 && value > 0;
    System.out.println(res);
  }
}
