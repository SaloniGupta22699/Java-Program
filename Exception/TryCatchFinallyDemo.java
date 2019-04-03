package exception;
import java.util.Scanner;


public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner (System.in);	
	System.out.println("enter the number 1");
	int num1=scan.nextInt();
	
	System.out.println("enter the number 2");
	int num2=scan.nextInt();
	
	try{

		int result=num1/num2;
	

System.out.println("the result will be"+result);
System.out.println("hence computation is done");
	
	
if(result==10)
{
	return;
	
}
	
	}	
		
catch(ArithmeticException e)
	{
System.out.println("Caught");	
    e.printStackTrace();
    
	
}

		
		
catch(Exception e)
	{
	e.printStackTrace();
	}

	
	finally{
		
		
		try{
			int result=num1/num2;
					}
		
		catch(Exception e)

		{
			
		System.out.println("exception is caught inside the final catch");
		
		
		}	
			
			System.out.println("hey!!!!  i am learning core java");
		
		}
	
		
	
	System.out.println("hello!!!!!!!!!1");
	System.out.println("computation is done");
	System.out.println("end of main");
	
	}

}
