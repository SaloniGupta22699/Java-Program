import java.util.*;


public class InsertionSort {

	public static  void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		int key=0;
		
		System.out.println(" the elements of array are:-");
		int arr[]=new int[1000];
		

		for(int i=0;i<5;i++)
		
		{
			
			System.out.println(arr[i]);
		}
		
		
		
		for(int j=1;j<5;j++)
		{
		
			key=arr[j];
			int i =j-1;
			
			while(i>=0&&arr[i]>key)
			{
				arr[i+1]=arr[i];
				i=i-1;
				
				
			}
			
			arr[i+1]=key;
			
			
		}
			
			
			
		System.out.println("the elements in the sorted array");
		for(int i=0;i<5;i++)
        System.out.println(arr[i]);		
		
		
		
		

	}

}
