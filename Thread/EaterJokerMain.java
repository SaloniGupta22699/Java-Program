package thread;

public class EaterJokerMain {

	public static void main(String[] args) {
	

		Eater eater=new Eater();
		Joker joker=new Joker();
		
		eater.start();
		joker.start();
		
		for(int p=1;p<300;p++)
			
		{
			System.out.println("main is main");
		}
		
		
	}

}
