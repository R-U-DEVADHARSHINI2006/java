package itjava.example;
// merge sorting using one array
import java.util.Arrays;

public class mergesortsinglearray {
	static void sort(int[]a, int start, int mid, int end) {
		int[] c = new int[a.length];
		int i = start;
		int j = mid;
		int k = start;
		while(i<mid && j<end) {
			if(a[i]<=a[j]) {
				c[k]=a[i];
				i++;k++;
			}
			else {
				c[k]=a[j];
				j++;k++;
			}
		}
		while(i<mid) {
			c[k]=a[i];
			i++;k++;
		}
		while(j<end) {
			c[k]=a[j];
			k++;j++;
		}
		 for(int x = start; x < end; x++) {
		        a[x] = c[x];
		    }
	}
	public static void main(String[] args) {
		int[]a = {1,3,7,9,1,2,5,6};
		int mid = a.length/2;
		int end = a.length;
		sort(a,0,mid,end);
		System.out.print(Arrays.toString(a));
	}

}
