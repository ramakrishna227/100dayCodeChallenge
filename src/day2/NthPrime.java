/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
package day2;

public class NthPrime {

	public static void main(String[] args) {
		int n = 10001;
		int primeCount = 0;

		for (long l = 2;; l++) {
			if (isPrime(l)) {
				primeCount++;
				if (n == primeCount) {
					System.out.println(n + "th largest prime number is " + l);
					break;
				}
			}
		}
	}

	private static boolean isPrime(long num) {
		for (long l = 2; l < num; l++) {
			if (num % l == 0) {
				return false;
			}
		}
		return true;
	}
}
