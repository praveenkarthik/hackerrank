import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		int i, j, res=0;
		for(i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for(i=0; i<n; i++) {
			for(j=i+1; j<n; j++) {
				if(a[j]-a[i] == k) {
					res++;
				} else if (a[j]-a[i] > k){
					break;
				}
			}
		}
		System.out.println(res);
	}
}