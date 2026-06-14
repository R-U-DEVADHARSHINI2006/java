package r;
import java.util.Scanner;
public class TwoDArrayAllOperations {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create 2D array
        int[][] a = new int[rows][cols];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // 1️⃣ Sum of all elements
        int totalSum = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                totalSum += a[i][j];
        System.out.println("1. Sum of all elements = " + totalSum);

        // 2️⃣ Sum of each row
        System.out.println("2. Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++)
                rowSum += a[i][j];
            System.out.println("Row " + i + " sum = " + rowSum);
        }

        // 3️⃣ Sum of each column
        System.out.println("3. Sum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++)
                colSum += a[i][j];
            System.out.println("Column " + j + " sum = " + colSum);
        }

        // 4️⃣ Maximum element
        int max = a[0][0];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (a[i][j] > max)
                    max = a[i][j];
        System.out.println("4. Maximum element = " + max);

        // 5️⃣ Minimum element
        int min = a[0][0];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (a[i][j] < min)
                    min = a[i][j];
        System.out.println("5. Minimum element = " + min);

        // 6️⃣ Diagonal elements
        System.out.print("6. Diagonal elements: ");
        if (rows == cols) {
            for (int i = 0; i < rows; i++)
                System.out.print(a[i][i] + " ");
            System.out.println();
        } else {
            System.out.println("Diagonal not possible (not a square matrix)");
        }

        // 7️⃣ Check square matrix
        if (rows == cols)
            System.out.println("7. It is a Square Matrix");
        else
            System.out.println("7. It is NOT a Square Matrix");

        // 8️⃣ Count even and odd
        int even = 0, odd = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (a[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
        System.out.println("8. Even count = " + even + ", Odd count = " + odd);

        // 9️⃣ Upper triangular matrix
        System.out.println("9. Upper Triangular Matrix:");
        if (rows == cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i <= j)
                        System.out.print(a[i][j] + " ");
                    else
                        System.out.print("0 ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Not possible (not a square matrix)");
        }

        // 🔟 Lower triangular matrix
        System.out.println("10. Lower Triangular Matrix:");
        if (rows == cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i >= j)
                        System.out.print(a[i][j] + " ");
                    else
                        System.out.print("0 ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Not possible (not a square matrix)");
        }

        sc.close();
    }
}
