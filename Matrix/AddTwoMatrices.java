/* Java Program Example - Add Two Matrices */
		
import java.util.Scanner;

public class AddTwoMatrices
{
   public static void main(String args[])
   {
       int i, j;
       int mat1[][] = new int[3][3];
       int mat2[][] = new int[3][3];
       int mat3[][] = new int[3][3];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Matrix 1 Elements : ");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat1[i][j] = scan.nextInt();
           }
       }
	   
       System.out.print("Enter Matrix 2 Elements : ");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat2[i][j] = scan.nextInt();
           }
       }
	   
       System.out.print("Adding both Matrix to form the Third Matrix...\n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat3[i][j] = mat1[i][j] + mat2[i][j];
           }
       }
	   
       System.out.print("The Two Matrix Added Successfully..!!\n");
	   
       System.out.print("The New Matrix will be :\n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               System.out.print(mat3[i][j]+ " ");
           }
           System.out.println();
       }
   }
}