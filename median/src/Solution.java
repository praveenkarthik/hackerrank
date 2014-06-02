import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	private static Scanner in;

	public static void main(String[] args) throws Exception {
		in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> x = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			char a = in.next().charAt(0);
			int num = in.nextInt();
			if (a == 'a') {
				x.add(num);
				Collections.sort(x);
				int l = x.size();
				if (l % 2 == 0) {
					float r = (float) ((float) (x.get((l / 2) - 1) + x
							.get((l / 2))) / 2.0);
					System.out.printf("%.1f\n", r);
				} else {
					System.out.println(x.get((l / 2)));
				}
			} else {
				if (x.isEmpty()) {
					System.out.println("Wrong!");
				} else {
					try {
						x.remove(x.indexOf(num));
					} catch (Exception e) {
						System.out.println("Wrong!");
						continue;
					}
					Collections.sort(x);
					int l = x.size();
					if (x.isEmpty()) {
						System.out.println("Wrong!");
						continue;
					}
					if (l % 2 == 0) {
						float r = (float) ((float) (x.get(l / 2) + x
								.get((l / 2) - 1)) / 2.0);
						System.out.printf("%.1f\n", r);
					} else {
						System.out.println(x.get((l / 2)));
					}
				}
			}
		}
	}
}
