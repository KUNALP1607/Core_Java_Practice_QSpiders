package Java_Practice_Basic_Topics;

import java.util.Scanner;

public class TwoDArrayDynamicInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array (row) : ");
		int row=sc.nextInt();
		System.out.print("Enter size of array (column) : ");
		int col=sc.nextInt();
		
		int[][] arr=new int[row][col];
		System.out.println("Default array created");
		
//		Reinitiallizing array by user dynamic input
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the array element at index row = "+i+" and col = "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		
//		Printing array
		System.out.println();
		System.out.println("Your array:");
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
