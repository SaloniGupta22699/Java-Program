/* Program of finding total marks and percentage of a Student*/



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Arr2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How Many Subjects?????");

		int n = Integer.parseInt(br.readLine().trim());

		int[] marks = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Marks:-");

			marks[i] = Integer.parseInt(br.readLine().trim());

		}

		int tot = 0;

		for (int i = 0; i < n; i++)
			tot += marks[i];

		System.out.println("total marks" + tot);

		float percent = (float) tot / n;

		System.out.println("the percentage will be:" + percent);

	}

}
