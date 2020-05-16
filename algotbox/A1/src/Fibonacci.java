import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;
    ArrayList<Long> arr = new ArrayList<>();
    arr.add((long)0);
    arr.add((long)1);
    for(int i=2;i<=n;i++) {
    	arr.add(arr.get(i-1) + arr.get(i-2));
    }
    return arr.get(n);
  }

  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    
    System.out.println(calc_fib(n));
  }
}
