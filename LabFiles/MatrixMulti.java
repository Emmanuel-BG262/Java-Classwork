package Module1;
import java.util.*;
public class MatrixMulti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter the number of Columns");
		int noOfCols = sc.nextInt();
		
		System.out.println("Enter the number of rowsB");
		int noOfRowsB = sc.nextInt();
		
		System.out.println("Enter the number of ColumnsB");
		int noOfColsB = sc.nextInt();
		
		if(noOfRows == noOfRowsB && noOfCols == noOfColsB) {
		
		
			int[][] matrix = new int[noOfRows][noOfCols];
			System.out.println("Enter the elements");
			for(int i = 0; i<noOfRows; i++) {
				for(int j = 0; j<noOfCols; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			
			int[][] matrixB = new int[noOfRowsB][noOfColsB];
			System.out.println("Enter the elements");
			for(int i = 0; i<noOfRowsB; i++) {
				for(int j = 0; j<noOfColsB; j++) {
					matrixB[i][j] = sc.nextInt();
				}
			}
			
			int[][] matrixC = new int[noOfRows][noOfCols];
			for(int i=0; i<noOfRows; i++) {
				for(int j=0; j<noOfCols; j++) {
					matrixC[i][j]=0;
					for(int k=0; k<noOfRows; k++) {
						matrixC[i][j] += matrix[i][k] * matrixB[k][j];
					}
				}
			}
			
			for(int i = 0; i<noOfRows; i++) {
				for(int j = 0; j<noOfCols; j++) {
					System.out.print(matrix[i][j] +" " +"\t");
				}System.out.println("\n");
			}
			
			for(int i = 0; i<noOfRows; i++) {
				for(int j = 0; j<noOfCols; j++) {
					System.out.print(matrixB[i][j] +" " +"\t");
				}System.out.println("\n");
			}
			
			for(int i = 0; i<noOfRows; i++) {
				for(int j = 0; j<noOfCols; j++) {
					System.out.print("Multiplied matix : " +matrixC[i][j] +" " +"\t");
				}System.out.println("\n");
			}
		}
		else {System.out.println("Not Possible");}
	
	}
}
