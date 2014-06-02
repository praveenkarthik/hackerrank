package try1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter op = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(in.readLine());
			int e = Integer.parseInt(st.nextToken());
			int o = Integer.parseInt(st.nextToken());
			int res = 3;
			for (int j = e; j <= o; j++) {
				if (res > a[j]) {
					res = a[j];
					if (res == 1) {
						break;
					}
				}
			}
			op.write(String.valueOf(res) + "\n");
		}
		in.close();
		op.flush();
		op.close();
	}
}
