package thread;

public class Joker extends Thread{
	
	
	public void run()
	{
		
		for(int p=1;p<300;p++)
		{
			
			System.out.println("joker is dancing="+p);
		}
		
		
		
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
