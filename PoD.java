import java.util.Scanner;
public class PoD {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Input a number: ");
int b = 1;
int a = 1;
b = a + 1;
int n = sc.nextInt();
n = ((n + 1) * n + 2) * n + 3;
System.out.println(n);
System.out.println(b);
}
}
