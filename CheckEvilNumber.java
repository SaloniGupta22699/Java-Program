import java.util.Scanner;

public class CheckEvilNumber 
{
	// Function to convert a number to Binary
	String toBinary(int n) 
    {
		// declare here.
        int r;
        String s=""; 
  
        // array to store digits.
        char dig[]={'0','1'}; 
  
        while(n>0)
        {
        	// find remainder, add it to digit and reverse the digits.
        	r=n%2; 
        	s=dig[r]+s; 
            n=n/2;
        }
        return s;
    }
     
	// Function to count no of 1's in binary number
    int countOne(String s) 
    {
        int c = 0, l = s.length();
        char ch;
        for(int i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch=='1')
            {
                c++;
            }
        }
        return c;
    }
     
    public static void main(String args[])
    {
    	// create object for number and scanner class.
        CheckEvilNumber ob = new CheckEvilNumber();
        Scanner sc = new Scanner(System.in);
         
        // enter the positive number here.
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
         
        String bin = ob.toBinary(n);
        
        // here print the binary number of the number.
        System.out.println("Binary Equivalent = "+bin);
         
        int x = ob.countOne(bin);
        
        // print the number of 1,s
        System.out.println("Number of Ones = "+x);
         
        // check for evil or not.
        if(x%2==0)
            System.out.println(n+" is an Evil Number.");
        else
            System.out.println(n+" is Not an Evil Number.");
    }
}