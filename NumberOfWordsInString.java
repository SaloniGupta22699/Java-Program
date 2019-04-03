/* Program of Nummber of words in a String */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfWordsInString {
    private static int numberofwords = 0;
    private static boolean flag = true;
    public static void main(String[] args) {
        while (flag == true) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter String or Enter 'exit' to end program:");
                String input = in.readLine();
                if ((input.equalsIgnoreCase("exit"))) {
                    System.out.println("Program ended");
                    System.exit(0);
                } else {     
                    char[] inputArray = input.toCharArray();
                    for (int i = 1; i < inputArray.length; i++) {
                        if (inputArray[i] == ' '&& !(inputArray[i - 1] == ' ')|| (i == inputArray.length - 1 && !(inputArray[i] == ' '))) {
                            numberofwords++;
                        }
                    }
                }
                System.out.println("String has number of words= "+ numberofwords);
                System.out.println();
                numberofwords = 0;
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }
}


