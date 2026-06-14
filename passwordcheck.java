package r;
import java.util.Scanner;
public class PasswordCheck {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter password: ");
	        String password = sc.nextLine();
	        try {
	            if (password.length() < 8) {
	                throw new Exception("Password must be at least 8 characters");
	            }
	            System.out.println("Password accepted");
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        sc.close();
	    }
	}
