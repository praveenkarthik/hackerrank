package try1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		StringBuffer res = new StringBuffer();
		int l = s.length();
		int c = (int) Math.ceil(Math.sqrt(l));
		for (int i = 0; i < c; i++) {
			for (int j = i; j < l; j += c) {
				res.append(s.charAt(j));
			}
			res.append(' ');
		}
		System.out.println(res);
	}
}
