
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInputStringDemo {

	public static void main(String[] args) {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(isr);
		System.out.println("_#_#)#Enter the String");
		String str="";
		try {
			str = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("str- "+str);
		//[ ]+ = split the string based on one or more spaces
//		/arr.length
		//str.length();
		String arr[]=str.split("[ ]+");
		int count=0;
		for(String pp:arr){
			count++;
		}
		System.out.println("#)#)number of words = "+count);
	}

}