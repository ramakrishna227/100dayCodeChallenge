package day9;

import java.time.Duration;
import java.time.Instant;

public class LongestCollatzSequence {
	public static void main(String[] args) {
		Instant start = Instant.now();
		long result = 0;
		long resultedNumber = 0;
		for (long i = 1000000; i > 0; i--) {
			long total = findNumber(i);
			if (total > result) {
				result = total;
				resultedNumber = i;
			}

		}
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(resultedNumber + "  " + result + " Duration is " + duration.toMillis());
	}

	public static long findNumber(long n) {
		long count = 1;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
				count++;
			} else {
				n = (3 * n) + 1;
				count++;
			}
		}
		return count;
	}
}
