package arrays;
import java.util.Scanner;
public class ArrayPattern06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");  // Program to print a solid Rhombus
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
