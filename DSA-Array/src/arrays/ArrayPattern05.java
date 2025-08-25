package arrays;
import java.util.Scanner;
public class ArrayPattern05 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: "); // Program for butterfly pattern
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				for(int k=0;k<2*n-2*i-2;k++) {
					System.out.print(" ");
				}
				for(int z=0;z<=i;z++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=n;i>0;i--) {
				for(int j=i;j>0;j--) {
					System.out.print("*");
				}
				for(int k=0;k<2*n-2*i;k++) {
					System.out.print(" ");
				}
				for(int z=i;z>0;z--) {
					System.out.print("*");
				}
				System.out.println();
			}
			sc.close();
		}
}
