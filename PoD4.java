import java.util.Scanner;
class PoD4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int number = scanner.nextInt();
    if (number % 2 == 0) {

      System.out.println(number + 2);
    }
    else if (number % 2 == 1) {
      System.out.println(number + 1);
    }
  }
}
