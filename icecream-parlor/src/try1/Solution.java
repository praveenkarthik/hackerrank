//Success

package try1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		for (int ctc = 0; ctc < tc; ctc++) {
			int found = 0;
			int m = Integer.parseInt(in.readLine());
			int n = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine());
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] + a[j] == m) {
						System.out.println(++i + " " + ++j);
						found = 1;
						break;
					}
				}
				if (found == 1)
					break;
			}
		}
	}
}
