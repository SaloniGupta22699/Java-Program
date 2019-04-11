/* Java Program Example - Convert Octal to Hexadecimal */
		
import java.util.Scanner;

public class OctaltoHexadecimal
{
    public static void main(String args[])
    {
        String octnum, hexnum;
        int decnum;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Octal Number : ");
        octnum = scan.nextLine();
		
        decnum = Integer.parseInt(octnum, 8);
        hexnum = Integer.toHexString(decnum);
		
        System.out.print("Equivalent Hexadecimal Value of " + octnum + " is :\n");
        System.out.print(hexnum);
    }
}