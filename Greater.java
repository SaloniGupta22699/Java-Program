/* Program of finding greater number*/


import java.util.*;

public class Greater {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
		System.out.println("enter the number 1");
		int num1=scan.nextInt();
		System.out.println("enter the number 2");
        int num2=scan.nextInt();
        System.out.println("enter the number 3");
        int num3=scan.nextInt();
        
        if(num1>num2&&num1>num3){
        	
        	System.out.println("number 1 is greater"+num1);
        	
        }
        else if (num2>num3){
        	System.out.println("number 2 is greater"+num2);
        	
        }
        else{
        	System.out.println("number 3 is greater");

	}
	}

	
}