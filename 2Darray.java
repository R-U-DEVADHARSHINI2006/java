package itjava.example;

import java.util.Scanner;

public class twodimarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rowsize = sc.nextInt();
        int colsize = sc.nextInt();

        int[][] arr = new int[rowsize][colsize];

        for (int row = 0; row < rowsize; row++) {
            for (int col = 0; col < colsize; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

       
        for (int row = 0; row < rowsize; row++) {
            for (int col = 0; col < colsize; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
