/* Java Program Example - Calculate Grade of Student */
		
import java.util.Scanner;

public class CalculateGrade
{
    public static void main(String args[])
    {
        int mark[] = new int[5];
        int i;
        float sum=0, avg;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Marks Obtained in 5 Subjects : ");
        for(i=0; i<5; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
		
        avg = sum/5;
		
        System.out.print("Your Grade is ");
        if(avg>80)
        {
            System.out.print("A");
        }
        else if(avg>60 && avg<=80)
        {
            System.out.print("B");
        }
        else if(avg>40 && avg<=60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}