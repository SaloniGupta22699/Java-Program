/* Program of Finding the Frequency of an array */

import java.util.Scanner;


public class frequency {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter the size of an array");
		int num=scan.nextInt();
		
		int arr[]=new int[10];
		int count =0;
		
		
			System.out.println("enter elements:");

			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
		}
	
	
	for(int i=0;i<num;i++){
	
	for(int j=i+1;j<num-1;j++){
		
		if(arr[i]==arr[j]&&arr[i]!='\0')
		{
			count++;
			arr[j]='\0';
		}
	}
		
		
		
		

		if(arr[i]!='\0'){
		System.out.println(arr[i]+  "is"+count+  "times");
		}
	}
	} 
}