package array;

import java.util.HashSet;
import java.util.Set;

// { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } }
// { {1,1,1 }, {1,0,1 }, {1,1,1 } }
//{ { 9, 8, 5, 1, 8, 0, 7, 3, 4, 1, 2, 0 }, { 1, 4, 3, 3, 8, 1, 6, 9, 3, 5, 7, 3 },
//{ 2, 5, 0, 9, 5, 9, 6, 4, 8, 4, 7, 6 }, { 4, 5, 2, 0, 8, 4, 3, 1, 0, 6, 4, 8 },
//{ 9, 0, 9, 5, 7, 7, 0, 9, 2, 2, 0, 9 }, { 2, 7, 6, 2, 1, 3, 0, 7, 0, 2, 7, 0 },
//{ 6, 0, 2, 8, 9, 6, 6, 0, 9, 6, 7, 6 }, { 3, 8, 8, 7, 0, 8, 9, 4, 7, 5, 6, 0 },
//{ 0, 9, 7, 3, 1, 7, 3, 0, 9, 7, 8, 8 }, { 6, 7, 1, 5, 3, 8, 3, 8, 6, 1, 7, 9 },
//{ 2, 6, 3, 9, 1, 2, 2, 4, 1, 9, 7, 4 }, { 8, 0, 4, 8, 8, 5, 8, 4, 2, 9, 1, 7 } }
public class SetMatrixZeroes {
	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		setZeroesWithHashSet(matrix);

//		setZeroesWithExtraArrays(matrix);
	}

	// Partial Optimization, time O(m*n) & space O(m+n) complexity
	public static void setZeroesWithExtraArrays(int[][] matrix) {

		int[] row = new int[matrix.length];

		int[] column = new int[matrix[0].length];

		for (int i = 0; i < row.length; i++)
			for (int j = 0; j < column.length; j++)
				if (matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}

		for (int i = 0; i < row.length; i++)
			for (int j = 0; j < column.length; j++)
				if (row[i] == 1 || column[j] == 1)
					matrix[i][j] = 0;
	}

	// worst time O(m*n)*(m+n) & space complexity O(m*n)
	public static void setZeroesWithHashSet(int[][] matrix) {

		Set<String> set = new HashSet<>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0 && !set.contains("row-" + i + "--" + "column-" + j))
					markRowAndColumn(matrix, i, j, set);
			}
		}

	}

	// support for setZeroesWithHashSet
	public static void markRowAndColumn(int[][] matrix, int i, int j, Set<String> set) {
		for (int incre = 0; incre < matrix[i].length; incre++) {
			if (matrix[i][incre] != 0) {
				matrix[i][incre] = 0;
				set.add("row-" + i + "--" + "column-" + incre);
			}

		}
		for (int incre = 0; incre < matrix.length; incre++) {
			if (matrix[incre][j] != 0) {
				matrix[incre][j] = 0;
				set.add("row-" + incre + "--" + "column-" + j);
			}
		}

	}
}
