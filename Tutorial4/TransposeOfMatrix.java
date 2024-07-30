import java.util.*;

public class TransposeOfMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for the matrix(r c):");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] Matrix= new int[r1][c1]; 
        int[][] Trans= new int[c1][r1]; 
        System.out.println("Enter matrix values:");
        for(int i=0; i<r1 ;i++){
            for(int j=0; j<c1 ; j++){
                System.out.print("Mat ["+i+"]["+j+"]: ");
                Matrix[i][j]= sc.nextInt();
                Trans[j][i]=Matrix[i][j];
            }
        }
   
        System.out.println("Original Matrix:");
        for(int i=0; i<r1 ;i++){
            for(int j=0; j<c1 ;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
     
        System.out.println("Transposed Matrix:");
        for(int i=0; i<c1 ;i++){
            for(int j=0; j<r1 ;j++){
                System.out.print(Trans[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
