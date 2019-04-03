/* Program of Quick Sort */


import java.util.*;


public class Quick {

	void quicksort(int arr[],int p,int r)
	{
		if(p<r)
		{
			int q=partition(arr,p,r);
			quicksort(arr,p,q-1);
			quicksort(arr,q+1,r);
		}}	
		
	int partition(int arr[],int p,int r)	
	{
		
	int x=arr[r];
	
	int i=p-1;
	
	
	for(int j=p;j<r;j++)
	{
		if(arr[j]<=x)
		{
			i=i+1;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		
	}
	}
	
int temp1=arr[i+1];
arr[i+1]=arr[r];
arr[r]=temp1;

	
	return (i+1);
	
	}
	
	
	
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[50];
		int num,i;
		
		 
		Quick  q=new Quick();
			
			System.out.println("enter the size of an array");
		num=scan.nextInt();
			
			
			
				System.out.println("enter elements:");

				for( i=1;i<num+1;i++)
				{
					arr[i]=scan.nextInt();
			}

				q.quicksort(arr, 1, num);
				System.out.println("YOUR sorted array is:-");
				
				for(i=1;i<num+1;i++)
				{
					System.out.print(" ");
					System.out.print( arr[i]);
				}

		}

	}