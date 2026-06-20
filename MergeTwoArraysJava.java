package itjava.example;
//with 2 arrays
import java.util.Arrays;
public class mergesort {
	static int[] sort(int[]a, int[]b) {
		int al = a.length;
		int bl = b.length;
		int[]c = new int[al+bl];
		int i=0; int j=0; int k=0;
		while(i<al&&j<bl) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				i++; k++;
			}
			else {
				c[k]=b[j];
				j++;k++;
			}
		}
		while(i<al) {
			c[k]=a[i];
			i++;k++;
		}
		while(j<bl) {
			c[k]=b[j];
			j++;k++;
		}
		return c;
		}
	public static void main(String[] args) {
		int[]a= {1,2,3,5};
		int[]b= {7,8,9,11};
		int[]c = sort(a, b);
        System.out.println(Arrays.toString(c));

	}

}
