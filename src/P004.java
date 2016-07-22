/*
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class P004 {
	public static void main(String[] args) {
		long st= System.currentTimeMillis();
		int maxTriple = (int) 999*999 / 1000 + 1;
		boolean found = false;
		
		for (int i = maxTriple; i > 0 && !found; i--) {
			int[] digits = {(int) i / 100, (int) i / 10 % 10, i % 10};
			int val = 100001 * digits[0] + 10010 * digits[1] + 1100 * digits[2];
			int start = (int) Math.sqrt(val);
			while (start > 99 && !found) {
				if (val % start == 0 && val / start < 1000) {
					found = true;
					System.out.println(val + " = " + start + " + " + val / start);
				}
				start--;
			}
		}
		System.out.println(System.currentTimeMillis() - st);
	}
}
