import java.util.Scanner;

public class ProductOfNumbers {
  public static void main(String args[]) {

    // Create a new Scanner
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = 0;
    for (int i = 1 ; i <= a ; i++) {
      System.out.print("Input: ");
      int n = sc.nextInt();
      if (n % 6 == 0)

        sum += n;
        System.out.println(sum);
      }
    }
  }
