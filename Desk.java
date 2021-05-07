import java.util.*;
public class Desk {
  public static void main(String args []) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Students in classroom one: ");
    int classroomOne = sc.nextInt();
    System.out.print("Students in classroom two: ");
    int classroomTwo = sc.nextInt();
    System.out.print("Students in classroom three: ");
    int classroomThree = sc.nextInt();
    if (classroomOne % 2 == 1) {
      classroomOne = (classroomOne + 1);
    }
    if (classroomTwo % 2 == 1) {
      classroomTwo = (classroomTwo + 1);
    }
    if (classroomThree % 2 == 1) {
      classroomThree = (classroomThree + 1);
    }
    System.out.println((classroomOne + classroomTwo + classroomThree) / 2);


  }
}
