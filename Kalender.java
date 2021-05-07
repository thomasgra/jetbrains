import java.util.*;

public class Kalender {
  public static void main(String[] args) {

    // create a new calendar
    GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
    
    // print the current date and time
    System.out.println("" + cal.getTime());

    // check if it is a leap year
    boolean isLeapYear = cal.isLeapYear(cal.get(GregorianCalendar.YEAR));
    System.out.println("Is leap year:" + isLeapYear);

    // check if 2013 is a leap year
    isLeapYear = cal.isLeapYear(2013);
    System.out.println("Is leap year:" + isLeapYear);
  }
}
