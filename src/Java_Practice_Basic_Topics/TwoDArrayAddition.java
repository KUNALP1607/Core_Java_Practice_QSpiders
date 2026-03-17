
package Java_Practice_Basic_Topics;

public class TwoDArrayAddition {

	public static void main(String[] args) {
		int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
		int [][] result = new int[arr1.length][arr1[0].length];
		
//		Adding arr1 and arr2:
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length; j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
//		Printing arr1 array:
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
//		Printing arr2 array:
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	
		
//		Printing result array:
		System.out.println("The Addition of array 1 and array 2 is : ");
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		}
	}

