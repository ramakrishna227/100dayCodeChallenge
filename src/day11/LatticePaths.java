package day11;

public class LatticePaths {
	static long counter;

	public static void main(String[] args) {

		findPaths(0, 0);
		System.out.println(counter);
	}

	public static void findPaths(int i, int j) {
		if (i == 20 && j == 20) {
			counter++;
		} else {
			if (i < 20) {
				int c = i + 1;
				findPaths(c, j);
			}
			if (j < 20) {
				int d = j + 1;
				findPaths(i, d);
			}
		}
	}
}
