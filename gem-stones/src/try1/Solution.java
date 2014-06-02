package try1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author KARTHIK_PRAVEEN
 */
public class Solution {
	private static ArrayList<String> a = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int minIndex = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			String s = in.readLine();
			if (s.length() < minIndex) {
				minIndex = i;
			}
			a.add(s);
		}
		char[] toComp = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int res = 0;
		for (char c : toComp) {
			if (isGem(c)) {
				res++;
			}
		}
		System.out.println(res);
	}

	private static boolean isGem(char c) {
		for (String s : a) {
			if (s.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}
}