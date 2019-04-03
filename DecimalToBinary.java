/* Program  of Converting Decimal to Binary */


import java.util.Scanner;

//133%2
public class DecimalToBinary {
	
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the num");
			int num=scan.nextInt();
			String result=dtob(num);
			System.out.println("Binary of "+num+" is "+result);
	}
	
	//13 - >>>10
	private static String dtob(int num){

		String binary="";	
		while(num>0){
			int rem=num%2;
			num=num/2;
			binary=rem+binary;
		}
		return binary;
	}
	
}
