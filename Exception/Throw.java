package exception;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the name");
		
		String name=scan.nextLine();
		
		
		try{
			
			if(name.equals("saloni"))
			{
				
				Exception exception=new Exception("this name is not permitted");
				throw exception;}
					}
	catch(Exception ex){
		
System.out.println(ex.getMessage());		
	}

System.out.println("hello!!!! the name is"+" "+name);
System.out.println("end of main");

	
	
	
	
	
	
	
	
	
	}

}
