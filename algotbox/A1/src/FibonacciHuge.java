import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        ArrayList<Long> F = new ArrayList<>();
        F.add((long)0);
        F.add((long)1);
        
        for(int i=2;i<=n;i++) {
        	F.add((F.get(i-1)+F.get(i-2))%1000);
        }
        
    	if (n <= 1)
            return n;

    return F.get(n)%m;    
    
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

