/* Program of finding power of number */


import java.util.*;


public class power {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		int temp = 1;
		
		System.out.println("Enter the value of number 1");
		int a=scan.nextInt();
		
		
		System.out.println("Enter the power");
		int b=scan.nextInt();
		
	
	
		for(int i=0;i<b/2;i++)
		
	{
		
	
	temp=temp*a;

	
	}
		
		System.out.println("");
		
if(b%2==0)	
{
	System.out.println(a+"^"+b+"="+(temp*temp));
}
	


else
{
	
	System.out.println(a+"^"+b+"="+(temp*temp*a));
}
	
	
	
	
	
	}

}
