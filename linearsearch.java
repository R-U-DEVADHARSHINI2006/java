package itjava.example;
//linear search 1D array
public class linearsearch {

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {9, 8, 4, 2, 10};
        int target = 4;

        int index = linearSearch(arr, target);

        System.out.println(index);
    }
}
