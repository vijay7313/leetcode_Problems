package leet_array;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rotate(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}

	private static void rotate(int[][] matrix) {

		int length = matrix.length;
		int temp;
		for (int i = 0; i < length; i++)
			for (int j = i + 1; j < length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}

		for (int i = 0; i < length; i++) {
			int start = 0;
			int end = length - 1;
			while (start < end) {
				temp = matrix[i][start];
				matrix[i][start++] = matrix[i][end];
				matrix[i][end--] = temp;
			}
		}

	}
}
