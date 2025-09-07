package twoPointer;

public class Sqrt_x {

    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // avoid overflow

            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Sqrt_x obj = new Sqrt_x();

        System.out.println(obj.mySqrt(0));  // 0
        System.out.println(obj.mySqrt(1));  // 1
        System.out.println(obj.mySqrt(4));  // 2
        System.out.println(obj.mySqrt(8));  // 2
        System.out.println(obj.mySqrt(10)); // 3
        System.out.println(obj.mySqrt(2147395599)); // 46339
    }
}
