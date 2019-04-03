/* Program of Prime Number */ 


import java. util.*;



public class Primenumber {
	
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter the number....");
		int number=scan.nextInt();
		
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
         
            	System.out.println("number is not prime");
            
            }
            
            else
            {
            	System.out.println("number is not prime");
            }
            
        }

		
		
		
		
		
	}
	
	

}
