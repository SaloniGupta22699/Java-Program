
public class MethodOverriding {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.call();
		mobile.display();
		
		mobile=new HTCMobile();
		mobile.call();
		mobile.display(); //method from sublcass
		
	}
}
