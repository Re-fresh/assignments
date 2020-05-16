import java.util.*;

public class LCM {
	private static long lcm_naive(long a, long b) {
		long large = 0;
		long small=0;
		if (a > b) {
			large = a;
			small =b;}
		else {
			large = b;
			small=a;}
		for (long l = large; l <= a * b; l += large)
			if (l % small == 0)
				return l;
		return a*b;
	}

	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();

		System.out.println(lcm_naive(a, b));
	}
}
