/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/


//WORST SOLUTION TOOK 19MIN
package day4;

import java.time.Duration;
import java.time.Instant;

import javax.management.InstanceAlreadyExistsException;

public class SummationOf2MillionPrimes {
	public static void main(String[] args) {
		Instant start = Instant.now();
		long result = 0;
		long num = 2000000;
		// long num = 10;
		for (long l = 2; l < num; l++) {
			if (isPrime(l)) {
				System.out.println(l);
				result += l;
			}
		}
		Instant end = Instant.now();
		Duration timeTook = Duration.between(start, end);
		System.out.println(result + " time took to find is " + timeTook);
	}

	private static boolean isPrime(long l) {
		for (long k = 2; k < l; k++) {
			if (l % k == 0) {
				return false;
			}
		}
		return true;
	}
}
