package r;
import java.util.Scanner;
public class Palindrome {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed = reversed + str.charAt(i);
	        }
	        if (str.equalsIgnoreCase(reversed)) {
	            System.out.println("It is a Palindrome.");
	        } else {
	            System.out.println("It is not a Palindrome.");
	        }

	        sc.close();
	    }
}
