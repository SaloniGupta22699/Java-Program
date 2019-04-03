/*Program of sum of the array*/


import java.util.Scanner;


public class arraysum {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		
		int arr[]=new int[10];
		

		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
	}
		
		int sum=0;
		
		for(int i=0;i<num;i++)
		{
			sum=sum+arr[i];
		}
		
		
System.out.println(sum);		
	}
}