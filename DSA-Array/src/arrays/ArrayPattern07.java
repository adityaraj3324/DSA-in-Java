package arrays;
import java.util.Scanner;

public class ArrayPattern07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			int m = i;
			for(int j=1;j<=i;j++) {
				
				System.out.print(m--);
			}
			int l=2;
			for(int z=1;z<i;z++) {
				System.out.print(l++);
			}
			System.out.println();
		}
		sc.close();
	}
}
