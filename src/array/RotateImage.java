package array;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(Arrays.deepToString(matrix));

		rotate(matrix);

		System.out.println(Arrays.deepToString(matrix));

	}

	public static void rotate(int[][] matrix) {

		int length = matrix.length;
		for (int i = 0; i < length; i++)
			for (int j = i + 1; j < length; j++)
				swap(matrix, i, j);

		for (int i = 0; i < length; i++) {
			int start = 0;
			int end = length - 1;

			while (start < end) {
				int temp = matrix[i][start];

				matrix[i][start++] = matrix[i][end];

				matrix[i][end--] = temp;
			}
		}

	}

	public static void swap(int[][] matrix, int i, int j) {
		int temp = matrix[i][j];

		matrix[i][j] = matrix[j][i];

		matrix[j][i] = temp;
	}
}
