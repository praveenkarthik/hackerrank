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
			String[] s = in.readLine().split(" ");
			if (s[0].compareTo("hackerrank") == 0) {
				if (s[s.length - 1].compareTo("hackerrank") == 0) {
					out.write(String.valueOf(0) + "\n");
				} else {
					out.write(String.valueOf(1) + "\n");
				}
			} else if (s[s.length - 1].compareTo("hackerrank") == 0) {
				out.write(String.valueOf(2) + "\n");
			} else {
				out.write(String.valueOf(-1) + "\n");
			}
		}
		in.close();
		out.flush();
		out.close();
	}
}