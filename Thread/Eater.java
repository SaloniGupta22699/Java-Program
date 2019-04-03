package thread;

public class Eater extends Thread{
	
	public void run()
	{
		for(int i=1;i<300;i++)
		{
			System.out.println("hey!!!! i am eating the food="+i);
		}
	}

}
