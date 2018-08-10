package day1;

public class SumNumsDivisibleBy3And5 {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		int range = 1000;
		int result = 0;

		for (int i = 0; i < range; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;

			}
		}
		System.out.println(result);
	}
}
