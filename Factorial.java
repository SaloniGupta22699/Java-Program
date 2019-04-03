/*Program of  Factorial  of a Number */ 

public class Factorial {

	public static void main(String[] args) {
		
		int num=5;
		int sum=1;
		for(int x=2;x<=num;x++){
			sum=sum*x;
		}
		System.out.println("Result is ........."+sum);
	}
	
}
