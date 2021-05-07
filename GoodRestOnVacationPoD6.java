import java.util.Scanner;

class GoodRestOnVacationPoD6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int durationInDays = scanner.nextInt();
    int foodCostPerDay = scanner.nextInt();
    int oneWayFlightCost = scanner.nextInt();
    int costOfOneNightInHotel = scanner.nextInt();
    int total = (durationInDays * foodCostPerDay) + (oneWayFlightCost * 2);
    total = total + ((durationInDays - 1) * costOfOneNightInHotel);
    System.out.println(total);
  }
}
