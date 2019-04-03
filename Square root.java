/*Program of finding Square Value and Square Root*/


import java.util.*;


public class One {

	static void calculate(int x)
	{
		System.out.println("square value ="+(x*x));
	}
}




  class Two extends One{
	
	static void calculate(int x){
		
		System.out.println("square root="+Math.sqrt(x));
	}


public static void main(String args[]){
	
	Two t=new Two();
	t.calculate(25);
}


}


