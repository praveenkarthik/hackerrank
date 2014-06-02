package try1;

//https://www.hackerrank.com/contests/w2/submissions/code/1490742

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(in.readLine());
		for (int ctc = 0; ctc < tc; ctc++) {
			int n = Integer.parseInt(in.readLine());
			int a = Integer.parseInt(in.readLine());
			int b = Integer.parseInt(in.readLine());
			if (a == b) {
				out.write(String.valueOf(a * (n - 1)));
				continue;
			}
			if (a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			// ArrayList<Integer> res = new ArrayList<Integer>();
			for (int i = 0, j = n - 1; i < n; i++, j--) {
				out.write(String.valueOf((i * a) + (j * b)) + " ");
			}
			out.write("\n");
		}
		in.close();
		out.flush();
		out.close();
	}
}