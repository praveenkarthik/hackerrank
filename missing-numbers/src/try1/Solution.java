package try1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> res = new ArrayList<Integer>();

		int n1 = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		int[] a = new int[n1];
		for (int i = 0; i < n1; i++)
			a[i] = (Integer.parseInt(st.nextToken()));

		int n2 = Integer.parseInt(in.readLine());
		st = new StringTokenizer(in.readLine());
		for (int i = 0; i < n2; i++)
			b.add(Integer.parseInt(st.nextToken()));
		
		for(int t : a) {
			try {
				b.remove(b.indexOf(t));
			} catch (Exception e) {
				continue;
			}
		}
		for(int t : b) {
			if(res.indexOf(t) == -1) {
				res.add(t);
			}
		}
		Collections.sort(res);
		for (int i : res) {
			out.write(String.valueOf(i) + " ");
		}
		in.close();
		out.flush();
		out.close();
	}
}
