/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
package day3;

public class PythagoreanTriplet {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			for (int j = i + 1; j <= 1000; j++) {
				for (int k = j + 1; k <= 1000; k++) {
					if (i + j + k == 1000) {
						if (i * i + j * j == k * k) {
							System.out.println(i * j * k);
						}
					}
				}
			}
		}
	}
}
