import java.util.Scanner;
// Determine how many nuts each squirrel will get
class HowManyNuts {
  public static void main(String[] args) {

    // Create a new scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input: ");
    int squirrel = scanner.nextInt();
    int nuts = scanner.nextInt();
    System.out.println(nuts/squirrel);
  }
}
