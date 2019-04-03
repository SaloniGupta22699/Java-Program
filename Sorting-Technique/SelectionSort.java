/*Program of Selection Sort*/

import java.io.IOException;

import java.util.Scanner;


public class SelectionSort {

	public static void main(String[] args)
	
	{

		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter the size of an array");
		int num=scan.nextInt();
		
		int arr[]=new int[10];
		
		
			System.out.println("enter elements:");

			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
		}
		
		
		
	for(int i=0;i<num;i++)
		{
			
			for(int j=i+1;j<num;j++)
			{
				
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					
				}
					
					
					
			}
			
			
		}
				
		
		
		System.out.println("the elements in the sorted array");
		for(int i=0;i<num;i++)
      System.out.println(arr[i]);		
		
				
		
	}

}
