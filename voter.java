/* Program of finding voter eligibilty*/


import java.util.*;
class voter
{
	public static void main(String arg[])
	{	
		int age;
		Scanner s= new Scanner(System.in);
		System.out.println("enter your name =");
		String name=s.next();
		System.out.println("enter the age =");
		age=s.nextInt();
		
		try
		{
			if(age>=18)
System.out.println("DEAR "+name+" YOU ARE ELIGIBLE TO VOTE");

			else
				System.out.println("DEAR "+name+" YOU ARE NOT ELIGIBLE TO VOTE");
		}
		catch(Exception ex){}
	}
}
