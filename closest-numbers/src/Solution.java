import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] res_a = new int[n/2];
		int i, diff, c_diff, res = 0;
		for(i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		diff = a[1] - a[0];
		for(i=1; i<n-1; i++) {
			c_diff = a[i+1] - a[i];
			if(c_diff < diff) {
				diff = c_diff;
				res = 0;
				res_a[res] = i;
			} else if(c_diff == diff) {
				res++;
				res_a[res] = i;
			}
		}
		for(i=0; i<=res; i++) {
			System.out.print(a[res_a[i]] + " " + a[res_a[i]+1] + " ");
		}
	}
}