/* Java Program Example - Print Floyd's Triangle */
		
import java.util.Scanner;

public class FloydTriangle
{
    public static void main(String args[])
    {
	
        int range, i, j, k=1;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Range (Upto How Many Line ?) : ");
        range = scan.nextInt();
		
        System.out.print("Floyd's Triangle :\n");
        for(i=1; i<=range; i++)
        {
            for(j=1; j<=i; j++, k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
			
        }
    }
}