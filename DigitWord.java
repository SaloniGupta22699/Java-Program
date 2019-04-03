/* Program of Digit to Word */


import java.util.*;
public class DigitWord {

	public static void main(String[] args) {
String word[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter any number");
	
	int num=scan.nextInt();
	
	String out="";
	
	while(num>0)
	{
		int digit=num%10;
		out=" "+word[digit]+out;		
		num=num/10;
	
	}
System.out.println(out.trim());	
	
}

}
