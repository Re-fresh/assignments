import java.util.*;

public class GCD {
  private static int gcd(int a, int b) {
   while(a!=0 && b!=0 ) {
	   if(a>b) {
		   return gcd(b, a%b);
	   }
	   else
		   return gcd(a, b%a);
   }
    
   if(a>0) return a;
   else return b;
    
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    in.close();

    System.out.println(gcd(a, b));
  }
}
