package Java_Practice_Basic_Topics;

import java.util.Scanner;

public class Exception_Handling_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no. : ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd no. : ");
		int b = sc.nextInt();
		
		try{
			int c = a/b;
			System.out.println("Result: " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!");
		}
		
	}

}
