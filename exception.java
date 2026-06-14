package itjava.example;

import java.util.Scanner;

public class exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
        	System.out.println("finally block");
        }
int[] arr= {10,20,30};
try {
	System.out.println(arr[-1]);
} catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
	
}finally {
	System.out.println("inside finally block");
}
    }
}
