/* Program of finding the occurence of a number in a given array */

import java.util.*;


public class Array {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter the size of an array");
		int num=scan.nextInt();
		
		int arr[]=new int[10];
		int count =0;
		
		
		int x;
			System.out.println("enter elements:");

			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
		}
	
	System.out.println("enter the elements of to count numbers of occurences");		
			x=scan.nextInt();
			
	for(int i=0;i<num;i++)
	{
	if(arr[i]==x)	
	{
		count++;
	}
		
		
		
		
		
	}
	
	System.out.println("Number of occurence of the element"+count);
	
	
	
	}

}
