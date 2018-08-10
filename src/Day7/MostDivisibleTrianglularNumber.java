package Day7;

public class MostDivisibleTrianglularNumber {
	public static void main(String[] args) {
		long i = 2;

		long triangeNumber = 1;

		while (!foundFactors(triangeNumber)) {

			triangeNumber = getTriangelNumber(i);
			i++;
		}

		System.out.println(triangeNumber);

	}

	private static long getTriangelNumber(long i) {

		return (i * (i + 1)) / 2;
	}

	private static boolean foundFactors(long num) {
		int result = 0;
		long number=num;
		for (long i = 1; i < number; i++) {
			
			if (num % i == 0) {
				if(num==i) {
				result=result+1;	
				}else {
				result = result+2;
				number=num/i;
				}
			}
		}
		System.out.println(num + " " + result);
		return (result >= 500);
	}
}
