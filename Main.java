import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your number:");
    int a = scanner.nextInt();
    int tens = 0;
  int  hundreds = 0;
if ((a % 10) == 0) {

System.out.println((tens) + "" + hundreds);
}

   hundreds = (a % 100) / 10;
  tens = (a % 100) / 10;
    int ones = a % 10;
    System.out.println((ones) + "" + (tens) + "" + hundreds);

  }
}
