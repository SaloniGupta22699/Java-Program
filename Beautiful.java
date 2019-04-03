/*Program of a Beautiful Number*/


import java.util.*;

public class Beautiful {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter the size of an array");
		int num=scan.nextInt();
		
		int arr[]=new int[10];
		int i,j,flag = 0,count=0,temp=0;
		
		
			System.out.println("enter elements:");

			for( i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
		}
		
		
		for( i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(arr[i]==arr[j])
				{
                flag++;
                }
			}
		if(arr[i]>num)
		{
			count++;
			
		}
		if(arr[i]<num)
		{
			
			temp++;
			
		}
		}	

		if(flag==0&&count==0&&temp==0
				
				)
		{
			System.out.println("Hello!!!your array is  beautiful");
		}
		
		
		else
		{
			System.out.println(" Sorry !!!your array is not beautiful");
		}
	}
	

}
