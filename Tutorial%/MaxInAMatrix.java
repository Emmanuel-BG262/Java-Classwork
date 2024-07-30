//Qusetion 1 from Tutorial 5
import java.util.Scanner;

public class MaxInAMatrix {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.print("Enter the number of rows : ");
        row = sc.nextInt();
        System.out.print("\nEnter the number of columns : ");
        col = sc.nextInt();
        int[][] Matrix = new int[row][col];
        
        System.out.println("\nEnter the elements of the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("Matrix [%d][%d]: ",i,j);
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        int max;
        System.out.println("Maximum elements in each row: ");
        for(int i=0;i<row;i++){
            System.out.print("Row "+i+": ");
            max = Matrix[i][0];
            for(int j=0;j<col;j++){
                if(mat[i][j]>max){
                    max = Matrix[i][j];
                }
            }
            System.out.println(max);
        }

	}
}
