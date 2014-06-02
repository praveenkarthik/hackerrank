package try1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ArrayList<String> res = new ArrayList<String>();
		Pattern pattern = Pattern.compile("^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
		for (int i = 0; i < n; i++) {
			String[] s = in.readLine().split(" ");
			for (String t : s) {
				Matcher m = pattern.matcher(t.toUpperCase());
				if (m.matches()) {
					if (res.indexOf(t) != -1) {
						continue;
					}
					res.add(t);
				} else {
					try {
						t = t.substring(0, t.length() - 1);
						m = pattern.matcher(t);
					} catch (Exception e) {
						continue;
					}
					if (m.matches() && res.indexOf(t) == -1) {
						res.add(t);
					}
				}
			}
		}
		Collections.sort(res);
		StringBuilder o = new StringBuilder();
		for (String t : res) {
			o.append(t).append(";");
		}
		try {
			if(res.size()>1) {
				o.deleteCharAt(o.length() - 1);
			}
		} catch (Exception e) {
		}
		System.out.println(o);
	}
}