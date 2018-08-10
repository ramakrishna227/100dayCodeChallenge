package day12;

import java.util.HashMap;
import java.util.Map;

public class NumberLetterCount {
	public static Map<Integer, Integer> numLetterMap = new HashMap<>();
	static int sum = 0;

	public static void main(String[] args) {

		numLetterMap.put(0, 0);
		numLetterMap.put(1, 3);
		numLetterMap.put(2, 3);
		numLetterMap.put(3, 5);
		numLetterMap.put(4, 4);
		numLetterMap.put(5, 4);
		numLetterMap.put(6, 3);
		numLetterMap.put(7, 5);
		numLetterMap.put(8, 5);
		numLetterMap.put(9, 4);
		numLetterMap.put(10, 3);
		numLetterMap.put(11, 6);
		numLetterMap.put(12, 6);
		numLetterMap.put(13, 8);
		numLetterMap.put(14, 8);
		numLetterMap.put(15, 7);
		numLetterMap.put(16, 7);
		numLetterMap.put(17, 9);
		numLetterMap.put(18, 8);
		numLetterMap.put(19, 8);
		numLetterMap.put(20, 6);
		numLetterMap.put(30, 6);
		numLetterMap.put(40, 5);
		numLetterMap.put(50, 5);
		numLetterMap.put(60, 5);
		numLetterMap.put(70, 7);
		numLetterMap.put(80, 6);
		numLetterMap.put(90, 6);
		numLetterMap.put(100, 10);
		numLetterMap.put(1000, 11);

		for (int num = 1000; num > 0; num--) {
			int temp = num;
			if (numLetterMap.containsKey(num)) {
				sum = sum + numLetterMap.get(num);
			} else {
				if (temp > 100 && 9 < temp % 100 && temp % 100 < 20) {
					// This is to take care of X11 to X19
					sum = sum + numLetterMap.get(temp % 100);
					temp = temp / 100;
				} else if (temp % 100 == 0) {
					// This is to take care of X00
					sum = sum + numLetterMap.get(temp / 100) + numLetterMap.get(100) - 3;
					continue;
				} else {
					sum = sum + numLetterMap.get(temp % 10);
					temp = temp / 10;

					sum = sum + numLetterMap.get((temp % 10) * 10);

					temp = temp / 10;
				}
				if (temp > 0) {
					sum = sum + numLetterMap.get(temp % 10) + numLetterMap.get(100);
				}
			}
		}
		System.out.println(sum);

	}
}
