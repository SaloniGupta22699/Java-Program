/* Java Programming Example */

import java.util.Scanner;

public class JavaProgramsExamples
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        int sum=0, avg=0;
        System.out.print("Enter any three numbers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        System.out.println("You entered "+num1+", "+num2+", and "+num3);
        System.out.println("Summing up all these numbers together...");
        sum = num1+num2+num3;
        System.out.println("Sum = " +sum);
        System.out.println("Finding average of all these three numbers...");
        avg = sum/3;
        System.out.println("Average = " +avg);
    }
}