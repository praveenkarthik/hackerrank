package try1;

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
			char[] s1 = in.readLine().toCharArray();
			char[] s2 = in.readLine().toCharArray();
			in.readLine();
			if (s2.length > s1.length) {
				out.write("\n");
				continue;
			}
			int times = s1.length - s2.length + 1;
			for (int i = 0; i < times; i++) {
				if (compare(s1, s2, i)) {
					out.write(String.valueOf(i) + " ");
				}
			}
			out.write("\n");
		}
		in.close();
		out.flush();
		out.close();
	}

	public static boolean compare(char[] s1, char[] s2, int i) {
		int changes = 0;
		for (int j = 0; j < s2.length; j++, i++) {
			if (s1[i] != s2[j]) {
				if (changes > 0) {
					return false;
				}
				changes++;
			}
		}
		return true;
	}
}