import java.util.*;


public class Solution {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i < n-1; i += 2) {
			if (a[i] != a[i + 1]) {
				System.out.println(a[i]);
				return;
			}
		}
		System.out.println(a[n-1]);
	}
}