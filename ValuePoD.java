// import java.util.Scanner;
// // Read a value and check whether it is less than 10
// public class ValuePoD {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("Input: ");
//     int siffra = scanner.nextInt();
//     if (siffra < 10) {
//       System.out.println(true);
//     }
//     else {
//       System.out.println(false);
//     }
//   }
// }
import java.util.Scanner;

class ValuePoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        // put your code here
        int input = scanner.nextInt();
        System.out.println(input < 10);
    }
}
