package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeSum {
	public static void main(String[] args) throws IOException {
		int inputs = 100;
		String[] input = new String[inputs];
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();

		while (str != null && !str.isEmpty()) {
			input[count] = str;
			str = br.readLine().trim();
			count++;
		}

		String result = null;
		int carry = 0;

		for (int i = 49; i >= 0; i--) {
			int sum = 0 + carry;
			for (int j = 0; j < inputs; j++) {
				sum = sum + Integer.parseInt(String.valueOf((input[j].charAt(i))));
			}
			System.out.println(sum);
			carry = sum / 10;
			if (result == null) {
				result = sum % 10 + "";
			} else {
				String temp = result;
				result = (sum%10) + temp;
			}

		}
		String temp = result;
		result = carry + temp;

		System.out.println(result.substring(0, 10));
	}
}
