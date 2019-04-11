/* Java Program Example - Convert Fahrenheit to Centigrade */
		
import java.util.Scanner;

public class ConvertFahrenheittoCentigrade
{
    public static void main(String args[])
    {
        float fah;
        double cel;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Temperature in Fahrenheit : ");
        fah = scan.nextFloat();
		
        cel = (fah-32) / 1.8;
		
        System.out.print("Equivalent Temperature in Celsius = " + cel);
    }
}