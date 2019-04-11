/* Java Program Example - Print 1-100 */
		
public class JavaProgram
{
    public static void main(String args[])
    {
        int n=1, i, j;
        for(i=0; i<10; i++)
        {
            for(j=0; j<10; j++)
            {
                System.out.print(n+ "  ");
                n++;
            }
            System.out.println();
        }
    }
}