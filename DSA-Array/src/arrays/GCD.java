package arrays;
import java.util.*;

public class GCD {

	    public static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int result = arr[0];
	        for (int i = 1; i < n; i++) {
	            result = gcd(result, arr[i]);
	        }

	        System.out.println( result);
	    }
}
