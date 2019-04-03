import java.util.*;


public class StringToInteger {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the string");
         String s=scan.nextLine();
         
         
         int i= Integer.parseInt(s);
         
         System.out.println("the integer value of this is"+i);
         
	}

}
