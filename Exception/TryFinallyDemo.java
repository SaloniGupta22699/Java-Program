package exception;
import java.util.Scanner;


public class TryFinallyDemo {

	public static void main(String[] args) {
	System.out.println("hello!!!!i  am saloni gupta");	
	Scanner scan=new Scanner (System.in);	
	System.out.println("enter the number 1");
	int num1=scan.nextInt();
	
	System.out.println("enter the number 2");
	int num2=scan.nextInt();
	
	try{

		int result=num1/num2;
	

System.out.println("the result will be"+result);
System.out.println("hence computation is done");
System.out.println("thanks!!!!!");
	
	
if(result==10)
{
	return;
	
}
	
	}	

	
	finally{
		
	System.out.println("hey!!!!  i am learning core java");
		
		}
	
		
	
	System.out.println("hello!!!!!!!!!1");
	System.out.println("end of main");
	
	}

}
