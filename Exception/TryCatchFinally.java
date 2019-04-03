package exception;
import java.util.Scanner;


public class TryCatchFinally {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner (System.in);
	
	System.out.println("enter the number 1");
	int num1=scan.nextInt();
	
	System.out.println("enter the number 2");
	int num2=scan.nextInt();
	
	
	 int temp=0;
	try{
	temp=num1/num2;
	if(temp==0)
	{	
		return;
	
	}
	
	}	

	
	catch(ArithmeticException ex)
	{
	
//ex.printStack Trace();
	
}

		

		
catch(Exception ex)
	{
	ex.printStackTrace();
	}

	
	

	
	finally{
		System.out.println("hey!!!!  i am learning core java");
	}
		
	
	System.out.println("hello!!!!!!!!!1");
	System.out.println("computation is done");
	System.out.println("the result is"+temp);
	
		
		
		
		
		
		
		
	}

}
