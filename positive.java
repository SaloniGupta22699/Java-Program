/* Program of finding positive numbers in array */



import java.util.Scanner;


public class positive {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		int temp=0;
		System.out.println("enter the size of an array");
		int num=scan.nextInt();
		
		int arr[]=new int[10];
		System.out.println("enter elements:");

		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
	}
		int max=arr[0];
		
		for(int i=1;i<num;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
		}
		}
		System.out.println(max);
		for(int i=0;i<num;i++)
		{
			if(max==arr[i]){
			temp++;
		}}
	System.out.println(temp);	
}}