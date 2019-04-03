/* Program of Happy Number */


import java.util.Scanner;

public class HappyNumber {
	
	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the num");
			int n=scan.nextInt();
			int flag=0;
			while(n>0){
				int result=happy(n);
				if(result==1){
					flag=1;
					break;
				}
				n=result;
			}
			
			if(flag==1){
				System.out.println("Number is happy!!!!!!!!!!");
			}else{
				System.out.println("Number is not happy!!!!!!!!!!");
				
			}
		
	}
	
	//13 - >>>10
	private static int happy(int num){
		int sum=0;
		while(num>0){
			int rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		return sum;
	}
	
}
