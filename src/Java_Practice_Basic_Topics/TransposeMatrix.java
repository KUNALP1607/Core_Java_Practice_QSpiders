package Java_Practice_Basic_Topics;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};	
		
		System.out.println("Given Array :");
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.err.println("============================");
		System.out.println();
		
		int[][] transpose = new int[arr[0].length][arr.length];
		
		for(int i=0; i<transpose.length; i++) {
			for(int j=0; j<transpose[0].length; j++) {
				transpose[i][j] = arr[j][i];
			} 
		}
		
		System.out.println("Transpose Array :");
		System.out.println();
		
		for(int i=0; i<transpose.length; i++) {
			for(int j=0; j<transpose[0].length; j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}
