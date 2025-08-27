package arrays;
import java.util.*;

public class ReverseInt {
    public static int reverse(int x) {
        long sum = 0;
        while (x != 0) {
            int rem = x % 10;
            sum = sum * 10 + rem;
            x /= 10;
        }
        return (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) ? 0 : (int) sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = reverse(n);
        System.out.println("Reversed integer: " + result);

        sc.close();
    }
}
