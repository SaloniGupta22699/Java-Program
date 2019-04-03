/* Program of Transpose of a number */


import java.util.*;



public class Transpose {
          
 public static void main(String  args[])
 {
	

Scanner scan=new Scanner(System.in);

System.out.print(" enter rows: columns:");

int r=scan.nextInt();
int c=scan.nextInt();

	 int arr[][]=new int[r][c];
	 
	 
	 
System.out.println("enter the elements of matrix:-");	 
	 
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++){
			
			arr[i][j]=scan.nextInt();
			
		}
	}
	 
	System.out.println("The Transpose matrix:-");
	
	
	for(int i=0;i<c;i++)
	{
		for(int j=0;j<r;j++){
			System.out.print(arr[j][i]+" ");
		}
		System.out.print("\n");
	}
	 
	 
	
	
	}

}
	