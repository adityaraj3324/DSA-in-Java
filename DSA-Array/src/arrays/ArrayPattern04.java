package arrays;

import java.util.Scanner;

public class ArrayPattern04{
	public static int Max(int arr[]) {
		int temp = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp = arr[i];
			}
		}
		return temp;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int num = sc.nextInt();
		System.out.println("Enter "+num+" elements.");
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		int max = Max(arr);
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<max;j++) {
				if(j>=max-arr[i]) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
//		System.out.println(max);
		sc.close();
	}
}
