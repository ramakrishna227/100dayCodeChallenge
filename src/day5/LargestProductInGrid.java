package day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LargestProductInGrid {

	public static void main(String[] args) {
		/*int arr[][] = new int[20][20];

		System.out.println("Enter 20*20 array");

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
		}*/

		/*
		 * for (int i = 0; i < 20; i++) { for (int j = 0; j < 20; j++) {
		 * System.out.print(arr[i][j] + " "); } System.out.println(); }
		 */

		int result = 0;

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j + 4 <= 20; j++) {
				int k = j;
				for (int l = 0; l < 4; l++) {
					System.out.println(i + " " + k);
					k++;
				}
			}
		}
		
	System.out.println("------------------------------------------------------------");	
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j + 4 <= 20; j++) {
				int k = j;
				for (int l = 0; l < 4; l++) {
					System.out.println(k + " " + i);
					k++;
				}
			}
		}
	}
}
