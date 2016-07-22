/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class P003 {
	public static void main(String[] args) {
		long val = 600851475143L;
		long max = (long) Math.sqrt(600851475143.0);
		for (int i = 2; i < max; i++) {
			if (val % i == 0) {
				val /= i;
				max = (long) Math.sqrt((double) val);
			}
		}
		System.out.println(val);
	}
}
