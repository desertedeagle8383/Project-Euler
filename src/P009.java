/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which,
 * 
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class P009 {
	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			int j = 1, k;
			do {
				k = 1000 - i - j;
				if (i*i + j*j == k*k) {
					System.out.println("i: " + i + ", j: " + j + ", k: " + k);
					System.out.println("ijk: " + i*j*k);
					return;
				}
				j++;
			} while (j < k);
		}
	}
}