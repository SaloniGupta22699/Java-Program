/* Program of Binary to Decimal Conversion */



import java.util.*;

public class BinarytoDecimal {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the binary number");
	int num=scan.nextInt();
	
	String result=btod(num);
	System.out.println("the result"+num+"is"+result);

	}
private static String btod(int num)
{

	String decimal="";
while(num!=0)
{
	num=num/10;
int rem=num*2;
decimal=rem+decimal;
	
}
return decimal;
}
	
}
