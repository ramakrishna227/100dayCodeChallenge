package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestProductInGrid {
	public static void main(String[] args) {

		System.out.println("Enter 20*20 array");
		int inputArr[][] = readInputArray();

		int result = 0;
		for (int o = 0; o < 20; o++) {
			for (int i = 0; i < 20; i++) {
				if (i + 4 <= 20) {
					int temp1 = 0, temp2 = 0;
					for (int j = i; j < i + 4; j++) {
						temp1 = temp1 + inputArr[o][j];
						temp2 = temp2 + inputArr[j][o];
					}
					if (temp1 > result)
						result = temp1;
					if (temp2 > result)
						result = temp2;
				}
			}

		}

		System.out.println(result);

		for (int i = 0; i < 20; i++) {
			int k = i;
			for (int j = 0; j <= i; j++) {
				if (j - 4 >= 0) {
					int temp1 = 0;
					for (int s = j; s < j + 4; s++) {
						temp1 = temp1 + inputArr[k][j];
						k--;
					}
					if (temp1 > result)
						result = temp1;
				}
			}

		}
		System.out.println(result);

		for (int j = 19; j >= 0; j--) {
			for (int i = 0; i < 20; i++) {
				int k = j;
				if (i + 4 <= 20) {
					int temp1 = 0;
					for (int s = i; s < i + 4; s++) {
						temp1 = temp1 + inputArr[k][s];
						k--;
					}
					if (temp1 > result)
						result = temp1;
				}
			}
		}
		System.out.println(result);
	}

	private static int[][] readInputArray() {
		int arr[][] = new int[20][20];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int counter = 0;
		try {
			line = br.readLine();
			for (int x = 0; x < 20; x++) {
				line.trim();
				String[] rowNums = line.split(" ");
				for (int i = 0; i < 20; i++) {
					arr[counter][i] = Integer.parseInt(rowNums[i].trim());
				}
				counter++;
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}
}
