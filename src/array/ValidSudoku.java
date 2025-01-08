package array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {

		char[][] sudokuBoard = { 
				    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
				    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};

		System.out.println(isValidSudoku(sudokuBoard));

	}

	public static boolean isValidSudoku(char[][] sudokuBoard) {

		Set<String> seen = new HashSet<>();

		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++) {
				char number = sudokuBoard[i][j];
				if (number != '.')
					if (!seen.add(number + " in-r " + i) 
							|| !seen.add(number + " in-c " + j)
							|| !seen.add(number + " in-b " + i / 3 + "-" + j / 3))
						return false;
			}

		return true;
	}
}
