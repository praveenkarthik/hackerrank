import java.util.Scanner;


public class Solution {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++) {
			int n = in.nextInt();
			int nc = n, res=0;
			int dig, ld;
			while(n!= 0) {
				dig = n/10;
				dig = dig*10;
				ld = n-dig;
				n = n/10;
				if(nc%ld == 0) {
					res++;
				}
			}
			System.out.println(res);
		}
	}
}
