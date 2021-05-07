import java.util.Scanner;

public class Chef {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("First name: ");
    String name = sc.next();
    System.out.print("Age: ");
    int age = sc.nextInt();
    System.out.print("Stage of education: ");
    String education = sc.next();
    System.out.print("Years of exerience: ");
    int experience = sc.nextInt();
    System.out.print("Cuisine preference: ");
    String preference = sc.next();
    System.out.println();
    System.out.print("The form for " + name + " is completed. We will contact");
    System.out.println(" you if we need a chef that cooks " + preference + " dishes.");
  }
}
