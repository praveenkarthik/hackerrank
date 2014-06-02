import java.util.Scanner;

public class Solution {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++){
			int n = in.nextInt();
			int res = 1;
			for(int j=0; j<n; j++){
				res = res*2;
				if(res>100000){
					res = res%100000;
				}
			}
			System.out.println(res-1);
		}
	}
}