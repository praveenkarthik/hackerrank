package try1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static int res = 0;
	static int totalP1Score = 0;
	static int totalP2Score = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		totalP1Score = Integer.parseInt(in.readLine());
		totalP2Score = Integer.parseInt(in.readLine());
		s(0, 0);
		System.out.println(res);
	}
	
	private static void s(int currentP1Score, int currentP2Score) {
		res++;
		System.err.println(currentP1Score + " " + currentP2Score);
		for(int i=currentP2Score+1 ; i<totalP2Score; i++) {
			s(currentP1Score, i);
		}
		for(int i=currentP1Score+1; i<totalP1Score; i++) {
			s(i, currentP2Score);
		}
	}
}