

//abstract cannot be instantiated  ->> new Robot()
// We can create reference of the abstract class ->>Robot robo;
//Can we define constructor inside the abstract class ? yes
//abstract class object is created with the help of the subclass
abstract public class Robot {
	
	public Robot(){
		System.out.println("...Deafult constructor of the Robot is called..");
	}
	
	public void walk(){
		System.out.println("@)@)@)Robot is walking....");
	}
	
	public void jump(){
		System.out.println("@)@)@)Robot is jumping....");
	}
	
	abstract public void speek();
	
	
	abstract public void dance();
	

}
