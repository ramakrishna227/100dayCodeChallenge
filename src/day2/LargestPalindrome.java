/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 Find the largest palindrome made from the product of two 3-digit numbers.*/
package day2;

public class LargestPalindrome {
	static int result;

	public static void main(String[] args) {

		for (int i = 999; i > 99; i--) {
			for (int j = 999; j >= i; j--) {
				int num = i * j;
				if (isPalindrome(num)) {
					break;
				}
			}
		}

		System.out.println("Result is " + result);
	}

	public static boolean isPalindrome(int num) {
		int number = num;
		int reverse = 0;
		while (num > 0) {
			reverse = (reverse * 10) + (num % 10);
			num = num / 10;
		}
		if (number == reverse) {
			if (result < number) {
				result = number;
			}
			return true;
		}

		return false;
	}
}
