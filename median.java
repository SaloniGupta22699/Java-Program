/*Program of finfing median of an array*/


import java.util.Scanner;
 
public class median{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);

		int n = in.nextInt();
	        int[] arr = new int[10000000];
	     
	        int median;
	        
					//System.out.println("enter elements:");

	        for(int i = 0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	       
	        

	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                
	                if(arr[i]>arr[j])
	                {
	          int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                    
	                
	                }
	            }
	        }
	        
	        
	        
	        System.out.println("YOUR sorted array is:-");
					
					for(int i=0;i<n;i++)
					{
						System.out.print(arr[i]);
					}

	        
	        
	        
	        
	        
	        if ( n % 2 == 0)
	        {
	          median = (arr[n/2] + arr[n/2+1])/2;                   
	        }
	        
	            else  
	            {
	                
	            
	          median = arr[n/2 + 1]; 
	            }
	        
	        System.out.print(median);
	        
	        
	        
	        
	        
	        
	    }
	    
	}
	   