package thread;

public class RunnableMain {

	public static void main(String[] args) {
		{
			Music music=new Music();
			Packer packer=new Packer();
			
			Thread t1=new Thread(music);
			Thread t2=new Thread(packer);
			
			t1.start();
			t2.start();
		}

	}

}
