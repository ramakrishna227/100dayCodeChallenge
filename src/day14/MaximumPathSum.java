package day14;

public class MaximumPathSum {
	public static void main(String[] args) {
		int[][] ip = new int[15][15];

		ip[0] = new int[] { 75 };
		ip[1] = new int[] { 95, 64 };
		ip[2] = new int[] { 17, 47, 82 };
		ip[3] = new int[] { 18, 35, 87, 10 };
		ip[4] = new int[] { 20, 04, 82, 47, 65 };
		ip[5] = new int[] { 19, 01, 23, 75, 03, 34 };
		ip[6] = new int[] { 88, 02, 77, 73, 07, 63, 67 };
		ip[7] = new int[] { 99, 65, 04, 28, 06, 16, 70, 92 };
		ip[8] = new int[] { 41, 41, 26, 56, 83, 40, 80, 70, 33 };
		ip[9] = new int[] { 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 };
		ip[10] = new int[] { 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 };
		ip[11] = new int[] { 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 };
		ip[12] = new int[] { 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 };
		ip[13] = new int[] { 63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 };
		ip[14] = new int[] { 04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23 };
		int result = 0;

		for (int col = 0; col < 15; col++) {
			int sum = 0;
			sum = sum + ip[14][col];
			int place = col;
			for (int row = 13; row >= 0; row--) {
				if (place == 0 || place == ip[row].length - 1) {
					sum = sum + ip[row][place];
					if (place != 0) {
						place = place - 1;
					}
				} else {
					if (col < ip[row].length) {
						if (ip[row][place - 1] > ip[row][place]) {
							sum = sum + ip[row][place - 1];
							place = place - 1;
							if (place < 0)
								place = 0;

						} else {
							sum = sum + ip[row][place];

						}
					}
				}
			}
			if (sum > result) {
				result = sum;
			}
		}
		System.out.println(result);
	}
}
