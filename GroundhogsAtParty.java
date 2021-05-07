import java.util.Scanner;
// Om det är vardag mellan 10 och 20 annars mellan 15 och 25
// Mata in två värden,
public class GroundhogsAtParty {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int value = scanner.nextInt();
    boolean weekend = scanner.nextBoolean();
    if ((value >= 15 && value <= 25 && value > 25) && (weekend == true)) {
      System.out.println(true);
    }
    else if ((value >= 10 && value <= 20) && (weekend == false)) {
      System.out.println(true);
    }
    else {
      System.out.println(false);
    }
  }
}
