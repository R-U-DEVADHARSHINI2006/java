package itjava.example;
//linear search 2d array
public class LinearSearch2D {

    static int[] linearSearch(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {5, 8, 7},
                {6, 110, 4}
        };

        int target = 8;

        int[] result = linearSearch(arr, target);

        System.out.println("Row = " + result[0]);
        System.out.println("Column = " + result[1]);
    }
}
