package day10;

import java.math.BigInteger;

public class PowerDigitSum {
	public static void main(String[] args) {
		BigInteger result = new BigInteger("2").pow(1000);
		System.out.println(result);
		String str = result.toString();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + Character.getNumericValue(str.charAt(i));
		}
		
		System.out.println(sum);
	}
}
