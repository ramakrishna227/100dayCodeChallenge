package Day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestProductInGrid {

	static int result;

	public static void main(String[] args) {
		System.out.println("Enter 20*20 array");
		int inputArr[][] = readInputArray();

		checkDownAndAcross(inputArr);

		for (int row = 0; row < 20; row++) {
			int col = 0;
			int rowtemp = row;
			while (col + 3 <= row) {
				int temp = 0;
				int x = rowtemp;
				for (int i = col; i < col + 4; i++) {

					temp = temp + inputArr[x][i];
					x--;
				}
				col++;
				rowtemp--;
				if(temp>result)
					result=temp;

			}
		}
		
		
		for(int col=0; col+3<=20;col++) {
			int row=20;
			
			
		}

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

	private static void checkDownAndAcross(int inputArr[][]) {
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

	}
}
