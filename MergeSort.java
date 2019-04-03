/* Program of Merge Sort */


import java.util.*;


public class MergeSort {

	
	void msort(int arr[],int p,int r)
	 	{
		
		
		if(p<r){
			
			int q=(p+r)/2;
		
			 msort(arr,p,q);
			 msort(arr,q+1,r);
			mergesort(arr,p,q,r);
		}
			
			
	}
			
	
	 void mergesort(int arr[],int p,int q,int r) 
	{
		
		int i ,j,k;
		
		int n1=q-p+1;
		int n2=r-q;
		
		int L[]=new int[25];

		int R[]=new int[25];
		
		for( i=1;i<n1+1;i++)
		{
			L[i]=arr[p+i-1];
		}
		for(j=1;j<n2+1;j++){
			
		
			R[j]=arr[q+j];
		}
		
		L[n1+1]=60000;
		R[n2+1]=60000;
		
i=1;j=1;

for(k=p;k<r+1;k++)
{
	if(L[i]<=R[j]){
			arr[k]=L[i];
			i++;
		}
		
			else{
				arr[k]=R[j];
				j++;
			}
			
		
		
		}
		
		
	}
	
	
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	
	int arr[]=new int[50];
	int num,i;
	
	 
	 MergeSort l=new MergeSort();
		
		System.out.println("enter the size of an array");
	num=scan.nextInt();
		
		
		
			System.out.println("enter elements:");

			for( i=1;i<num+1;i++)
			{
				arr[i]=scan.nextInt();
		}
		 l.msort(arr, 1, num);

			System.out.println("YOUR sorted array is:-");
			
			for(i=1;i<num+1;i++)
			{
				System.out.println(arr[i]);
			}

	}

}