/* Program of Armstrong Number*/

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	
	int sum=0,d;
	int t=num; 
	while(num!=0)
	{
		d=num%10;
		sum=sum+(d*d*d);
		num=num/10;
	}
if(sum==t)
{
	System.out.println("number is armstrong number");
}
else
	{
	System.out.println("number is not armstrong");}
	}
}

