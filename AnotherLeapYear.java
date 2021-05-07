import java.util.*;

// Ta reda på om angivet år är skottår
public class AnotherLeapYear {
  public static void main(String[] args) {

    // Create a new scanner
    Scanner sc = new Scanner(System.in);

// Input year
System.out.print("Input: ");
int year = sc.nextInt();

    // create a new calendar
    GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();




    // Output Leap if the given year is a leap year, otherwise output Regular


    // check if input is a leap year
    boolean isLeapYear = cal.isLeapYear(cal.get(GregorianCalendar.YEAR));
      isLeapYear = cal.isLeapYear(year);
      if (isLeapYear == true) {
        System.out.println("Leap");
      }
      else if (isLeapYear == false) {
        System.out.println("Regular");
      }
}

//     System.out.print("Input: ");
//     int year = sc.nextInt();
//     if ((year % 4 != 0 && year % 100 == 0) && year % 400 != 0) {
//       System.out.println("Regular");
//     }
//     else {
//       System.out.println("Leap");
//       public static boolean isLeapYear(int year) {
//   Calendar cal = Calendar.getInstance();
//   cal.set(Calendar.YEAR, year);
//   return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
// }
// System.out.println(isLeapYear);
//     }
    // if (year % 100 == 0) {
    //   System.out.println("Leap");
    // }
    // if (year % 400 != 0) {
    //   System.out.println("Regular");
    // }

  }
}
