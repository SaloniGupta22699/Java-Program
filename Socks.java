import java.util.*;


public class Socks {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	
	
	System.out.println("enter the size of socks");
	int num=scan.nextInt();
	
	int arr[]=new int[10];
	int pair[]=new int[10];
	
	int i,j,count=0,sum=0;
		System.out.println("enter the values of socks:");

		for( i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
	}
	
	for( i=0;i<num;i++)
	{
		count=1;
		
		for(j=i+1;j<num;j++)
		{
			
		
			if(arr[i]==arr[j]&&arr[i]!='\0')
			{
				
			count++;	
			
			arr[j]='\0';
			
			}
		pair[i]=count/2;
		}
		
		sum=sum+pair[i];
		
		}
	
	
	
	
	System.out.println("total pairs="+sum);
	
	
	
	
	
	
	
	
	
	
	
	}

}
