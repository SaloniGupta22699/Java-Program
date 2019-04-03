/* Program of Two Number */

//we have to remember
import java.util.*;

public class AddTwoNumber {

	public static void main(String[] args) {
		
		//System.in - reference of the keyboard
		//new means creating an instance of Scanner class
		//creating an instance of Scanner and it is connected 
		//with keyboard
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number1......");
		int num1=scan.nextInt();
		
		System.out.println("Enter the number2......");
		int num2=scan.nextInt();
		
		int temp=num1+num2;
		
		System.out.println("Result is = "+temp);
		
		
		

	}

}
