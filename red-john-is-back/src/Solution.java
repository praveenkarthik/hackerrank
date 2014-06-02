import java.util.Scanner;

public class Solution {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int i;
		for (i = 0; i < t; i++) {
			int n = in.nextInt();
			int x = n;
			int now = 1, res = 0;
			while (x >= 4) {
				x = x - 4;
				now = now + x + 1;
			}
			System.out.println(now);
			for (int j = 1; j <= now; j++) {
				if (isPrime(j))
					res++;
			}
			System.out.println(res);
		}
	}

	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		int sqrtN = (int) (Math.sqrt(n) + 1);
		for (int i = 6; i <= sqrtN; i += 6) {
			if (n % (i - 1) == 0 || n % (i + 1) == 0)
				return false;
		}
		return true;
	}
}
