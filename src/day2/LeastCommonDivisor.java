/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
package day2;

public class LeastCommonDivisor {
	public static void main(String[] args) {
		boolean found = false;
		int res = 0;
		int multiple = 1;
		while (!found) {
			res = 20 * multiple; // result should be multiple of 20
			found = true;
			for (int i = 2; i < 20; i++) {
				if (res % i != 0) {
					found = false;
					break;
				}

			}
			multiple++;
		}
		System.out.println("Result is " + res);
	}
}
