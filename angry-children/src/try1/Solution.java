package try1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int k = Integer.parseInt(in.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(in.readLine());
		}
		Arrays.sort(a);
		int res = a[k - 1] - a[0];
		for (int i = 0; i < n; i++) {
			try {
				int j = a[i + k - 1] - a[i];
				if (res > j) {
					res = j;
				}
			} catch (Exception e) {
				break;
			}
		}
		System.out.println(res);
	}
}
