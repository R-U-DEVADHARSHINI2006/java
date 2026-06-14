package r;

import java.util.Scanner;
public class Arrays {
	

	
	    public static void main(String[] args) {

	           Scanner sc = new Scanner(System.in);

	        // Input size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input elements
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	       
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {

	                if (arr[i] > arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }

	            }
	        }

	        System.out.println("\nAscending Order:");
	        for (int x : arr)
	            System.out.print(x + " ");

	       
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {

	                if (arr[i] < arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }

	            }
	        }

	        System.out.println("\n\nDescending Order:");
	        for (int x : arr)
	            System.out.print(x + " ");

	        sc.close();
	    }
	}
