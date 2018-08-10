/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/

//BEST SOLUTION

package day4;

import java.time.Duration;
import java.time.Instant;

public class SummationOf2MillionPrimes2 {
	public static void main(String[] args) {

		System.out.print(findSum(2000000));
	}

	private static long findSum(int num) {
		boolean[] boolArr = new boolean[num + 1];

		for (int i = 2; i < num + 1; i++) {
			if (boolArr[i] == false) {
				int counter = 2;
				while (i * counter < num + 1) {
					boolArr[i * counter] = true;
					counter++;
				}
			}
		}

		long result = 0;
		for (int k = 2; k < num + 1; k++) {
			if (boolArr[k] == false) {
				result = result + k;
			}
		}
		return result;
	}

}

// Answer is 142913828922
