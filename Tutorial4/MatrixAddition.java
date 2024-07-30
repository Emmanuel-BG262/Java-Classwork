import java.util.*;

public class MatrixAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns for both the matrix(rows, columns):");
        int row = sc.nextInt();
        int clmn= sc.nextInt();
        int[][] Matrix = new int[row][clmn];
        int[][] MatrixB = new int[row][clmn];
        System.out.println("\nEnter the elements to the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.printf("Matrix[%d][%d]:",i,j);
                Matrix[i][j] = sc.nextInt();   
            }
        }
        System.out.println("\nEnter elements to matrix2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.printf("MatrixB[%d][%d]:",i,j);
                MatrixB[i][j] = sc.nextInt();   
            }
        }
        System.out.println("\nMatrixA is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nMatrixB is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print(MatrixB[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] MatrixC = new int[row][clmn];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                MatrixC[i][j] = Matrix[i][j] + MatrixB[i][j];
            }
        }
        System.out.println("\nMatrixA + MatrixB is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print(MatrixC[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
