package day1;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class LargetPrimeFactor {
	public static void main(String[] args) {
		long num = 600851475143l;// 13195;
		List<Long> primeList = new ArrayList<>();
		Instant start = Instant.now();
		for (long l = 2l; l <= num; l++) {
			if (num % l == 0) {
				if (isPrime(l)) {
					num = num / l;
					primeList.add(l);
				}
			}
		}
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println("Duration is " + duration.toMillis() / 1000);
		primeList.stream().forEach(System.out::println);

	}

	private static boolean isPrime(long l) {
		boolean primeFlag = true;
		for (long m = l - 1; m > 1; m--) {
			if (l % m == 0) {
				primeFlag = false;
				break;
			}
		}
		return primeFlag;
	}
}
