import java.util.Iterator;
import java.util.LinkedList;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */
public class P010 {
	public static void main(String[] args) {
		LinkedList<Long> primes = new LinkedList<Long>();
		primes.add(2L);
		long size = 1L, sum = 0L;

		for (long n = 3; n < 2000000; n++) {
			int i = 0;
			boolean found = false;
			while (!found && i < size && Math.pow(primes.get(i), 2) <= n) {
				if (n % primes.get(i) == 0) {
					found = true;
				}
				i++;
			}
			if (!found) {
				primes.add(n);
				size++;
			}
		}
		
		for (Long i : primes) {
			sum += i;
		}
		
		System.out.println("Sum: " + sum);
	}
}