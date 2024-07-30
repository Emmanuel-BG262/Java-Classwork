//Question 4 from Tutorial 5

import java.util.*;

public class MatrixSymmetry {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the square matrix (n for nxn ): ");
		int n = sc.nextInt();
		
		System.out.println("\nEnter the elements of the matrix: ");
		
		int[][] Matrix = new int[n][n];
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("Matrix [%d][%d]: ",i,j);
				Matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nThe matrix is: ");
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(Matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		boolean isSymmetric = true;
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(Matrix[i][j] != Matrix[j][i]) {
					isSymmetric = false;
					break;
				}
			}
		}
		
		System.out.println(isSymmetric?"The matrix is symmetric.":"The matrix is not symmetric.");
	}

}
