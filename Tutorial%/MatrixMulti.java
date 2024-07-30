//Question 2 from Tutorial 5

import java.util.*;

public class MatrixMulti {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	
		int cols,rows;
		System.out.print("Enter the number of rows : ");
		rows = sc.nextInt();	
		System.out.print("\nEnter the number of columns : ");
		cols = sc.nextInt();
		
		int [][] Matrix = new int[rows][cols];
		
		System.out.println("\nEnter the elements: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.printf("Matrix [%d][%d]: ",i,j);
				Matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The matrix is: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(Matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.print("Enter the scalar value : ");
		int scalar = sc.nextInt();
		System.out.println("\nThe resulting matrix after scalar multiplication is: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(Matrix[i][j]*scalar+"\t");
			}
			System.out.print("\n");
		}
		
	}

}
