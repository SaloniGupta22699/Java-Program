import java.util.Random;
 class facefreq {

	
	public static void main(String args[])
	{
		Random rand=new Random();
		int[] freq=new int[7];
		
		for(int roll=1;roll<=1000;roll++)
		{
			++freq[1+rand.nextInt(6)];
		}
		
		for(int x:freq)
		{
			int i=0;
			System.out.printf("%d  \t  %d \n",i++,x);
		}
		
		
	}
}
