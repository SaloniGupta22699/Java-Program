/* Java Program Example - Convert Hexadecimal to Decimal */
		
import java.util.Scanner;

public class HexadecimaltoDecimal
{
    public static int hex2decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    public static void main(String args[])
    {
        String hexdecnum;
        int decnum;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Hexadecimal Number : ");
        hexdecnum = scan.nextLine();
		
        decnum = hex2decimal(hexdecnum);
		
        System.out.print("Equivalent Decimal Number is " + decnum);
    }
}