package itjava.example;

import java.util.Scanner;

public class sumofrows {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rowsize = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int colsize = sc.nextInt();

        int[][] arr = new int[rowsize][colsize];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rowsize; i++) {
            for (int j = 0; j < colsize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of each row:");

        for (int i = 0; i < rowsize; i++) {
            int sum = 0;

            for (int j = 0; j < colsize; j++) {
                sum += arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }

        sc.close();
    }
}
