package Java_Practice_Basic_Topics;

import java.util.Scanner;

public class OneDArrayDynamicInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Array created!!");
		
		System.out.println("Enter array elements : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.err.println("===========");
		System.out.println("Your array reinitialized array : ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
