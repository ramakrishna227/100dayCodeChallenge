package day1;

public class EvenFibonacci {
	public static void main(String[] args) {
		long prev = 1;
		long current = 1;
		long result = 0;
		while (current <= 4000000) {
			long temp = prev;
			prev = current;
			current = temp + current;
			if (current % 2 == 0) {
				result += current;
			}
		}
		System.out.println(result);
	}
}
