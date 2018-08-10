/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
package day2;

public class SumSquareDiff {
	public static void main(String[] args) {
		long sumOfSquares = 0;
		long squaresOfSum = 0;
		sumOfSquares = getSumOfSquares();
		squaresOfSum = getSquaresOfSum();
		System.out.println(Math.abs(sumOfSquares - squaresOfSum));
	}

	private static long getSquaresOfSum() {
		int sum = (100 * 101) / 2;
		return sum * sum;
	}

	private static long getSumOfSquares() {
		long res = 0;
		for (int i = 1; i <= 100; i++) {
			res = res + (i * i);
		}

		return res;
	}
}
