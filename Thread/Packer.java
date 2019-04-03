package thread;

public class Packer implements Runnable{
	
	public void run(){
		
		for(int j=1;j<500;j++)
		{
			
			
			System.out.println("packer is packing="+j);
		}
	}

}
