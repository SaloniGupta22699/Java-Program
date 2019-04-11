import java.util.Scanner;

public class CheckPronicNumber 
{
	public static void main(String args[])
    {
		// create object of scanner class
        Scanner sc = new Scanner(System.in);
         
        // enter the number here.
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        int flag = 0;
    
        for(int i=0; i<n; i++)
        {
            if(i*(i+1) == n)
            {
                flag = 1;
                break;
            }
        }
        
        // check here for Pronic number.
        if(flag == 1)
            System.out.println(n+" is a Pronic Number.");
        else
            System.out.println(n+" is not a Pronic Number.");      
    }
}