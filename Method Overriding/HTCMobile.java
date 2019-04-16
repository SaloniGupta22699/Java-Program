
public class HTCMobile  extends Mobile{
	
	public void bluetooth(){
		System.out.println("Bluetooth is enabled now.........");
	}
	
	//method overriding
	//is mechanism through which we can change the behavior of super class inside subclass
	//1. signature should be same  --- return type +name of the method + arguments
	//2. Access specifier cannot narrow  == private  = default- >protected -public
	//3. Exception cannot broaden...
	public void display(){
		System.out.println("This is special display for HTC!!!!!!!!!!");
		System.out.println("This is special display for HTC!!!!!!!!!!");
		System.out.println("This is special display for HTC!!!!!!!!!!");
	}

}
