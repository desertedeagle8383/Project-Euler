/*
 * 2520 is the smallest number that can be divided by each of the numbers from
 * 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */

import java.util.TreeMap;

public class P5 {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
		for (int prime : primes) {
			int mult = 0;
			for (int i = 2; i <= 20; i++) {
				int val = i, times = 0;
				while (val % prime == 0) {
					val /= prime;
					times++;
				}
				if (times > mult) {
					mult = times;
				}
			}
			map.put(prime, mult);
		}
		int val = 1;
		for (int key : map.keySet()) {
			System.out.println(key + "^" + map.get(key));
			val *= (int) Math.pow(key, map.get(key));
		}
		System.out.println(val);
	}
}
