import java.util.Iterator;
import java.util.LinkedList;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10,001st prime number?
 */
public class P007 {
	public static void main(String[] args) {
		LinkedList<Integer> primes = new LinkedList<Integer>();
		int n = 2;

		while (primes.size() < 10001) {
			boolean found = false;
			Iterator<Integer> iter = primes.iterator();
			while(iter.hasNext() && !found) {
				if (n % iter.next() == 0) {
					found = true;
				}
			}
			if (!found) {
				primes.add(n);
			}
			n++;
		}
		System.out.println(primes.getLast());
	}
}