/* Program of Jagged Array */



public class Jagged {

	public static void main(String[] args) {

		
		
int x[][]=new int[2][];

x[0]=new int[2];
x[1]=new int[3];


x[0][0]=10;
x[0][1]=11;



x[1][0]=18;
x[1][1]=19;
x[1][2]=20;




		
	for(int i=0;i<2;i++)	
	{
		System.out.print(x[0][i]+",");
	}
		
		
		System.out.println();

	
	for(int i=0;i<3;i++)	
	{
		System.out.print(x[1][i]+",");
	}
			
		
		
		
		
		
		
		
	}

}
