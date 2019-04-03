import java.util.*;

public class StringSplit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the string");
		String str = scan.nextLine();

		String[] s = str.split("[ ]+");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);

		}
		System.out.println("length is = " + s.length);

	}
}
