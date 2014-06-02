package try1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(in.readLine());
		for (int ctc = 0; ctc < tc; ctc++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] oa = new int[n];
			int m = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < n; i++) {
				oa[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < n; i++) {
				int[] a = oa.clone();
				for (int j = i, k = 0; k < m; j++, k++) {
					int toChangeIndex = j % n;
					int prevIndex = (toChangeIndex == 0) ? n - 1 : toChangeIndex - 1;
					int nextIndex = (toChangeIndex == a.length - 1) ? 0 : toChangeIndex + 1;
					a[toChangeIndex] = (a[toChangeIndex] + a[prevIndex] + a[nextIndex]) % 1000000007;
				}
				for (int t : a) {
					out.write(String.valueOf(t) + " ");
				}
				out.write("\n");
			}
			out.write("\n");
		}
		in.close();
		out.flush();
		out.close();
	}
}