import java.util.*;


public class Stringdetail{

	public static void main(String[] args) {
		
		

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the string");
		String s=scan.nextLine();

        
        String[]words=s.split("");
        
        String reverseString="";
        
        for(int i=0;i<words.length;i++)
        {
        	String word=words[i];
        	String reverseword="";
        	
        	for(int j=word.length()-1;j>=0;j--)
        	{
        		reverseword=reverseword+word.charAt(j);
        	}
        	reverseString=reverseString+reverseword+"";
        	
        	
        		
        	}
        
        System.out.println("your reverse string will be:"+reverseString);
        }
}
        
        
        
	
	
	
	

