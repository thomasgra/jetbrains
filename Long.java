public class Long {
public static void main(String args[]) {
int x = 15, y = 20;
int z = (x < y) ? (y + x) : (y - x);
boolean b1 = true , b2 = false, b3 = false;
boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
System.out.println(result);
}
}
