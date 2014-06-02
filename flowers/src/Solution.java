import java.util.Scanner;

public class Solution {
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		int n, k, i, x=0, min_cost=0, j;
		int c[] = new int[100];
		n = in.nextInt();
		k = in.nextInt();
		for(i=0; i<n; i++) {
			c[i] = in.nextInt();
		}
		quick_srt(c, 0, n-1);
		for(i=n-1, j=0; i>=0; i--, j++) {
			if(j%k == 0) {
				x++;
			}
			min_cost = min_cost + (x*c[i]);
		}
		System.out.println(min_cost);
	}
	public static void quick_srt(int array[], int low, int n) {
		int lo = low;
		int hi = n;
		if (lo >= n) {
			return;
		}
		int mid = array[(lo + hi) / 2];
		while (lo < hi) {
			while (lo < hi && array[lo] < mid) {
				lo++;
			}
			while (lo < hi && array[hi] > mid) {
				hi--;
			}
			if (lo < hi) {
				int T = array[lo];
				array[lo] = array[hi];
				array[hi] = T;
			}
		}
		if (hi < lo) {
			int T = hi;
			hi = lo;
			lo = T;
		}
		quick_srt(array, low, lo);
		quick_srt(array, lo == low ? lo + 1 : lo, n);
	}
}