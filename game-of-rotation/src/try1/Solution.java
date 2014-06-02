package try1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author KARTHIK_PRAVEEN
 */
public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		long[] a = new long[n];
		long sumOfArray = 0;
		long prodOfArray = 0;
		for (int i = 0; i < n; i++) {
			a[i] = (Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < n; i++) {
			sumOfArray += a[i];
			prodOfArray += (i + 1) * a[i];
		}
		long res = prodOfArray;
		for (int i = 0; i < n; i++) {
			prodOfArray -= sumOfArray;
			prodOfArray += a[i] * n;
			if (prodOfArray > res) {
				res = prodOfArray;
			}
		}
		System.out.println(res);
	}
}