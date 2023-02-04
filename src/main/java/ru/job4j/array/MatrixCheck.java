package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length -1; j++) {
                if (board[i][j] == 'X' && board[i][j] == board[i][j+1]) {
                    result = true;
                    break;
                }
            }

        }
        return result;
    }
}

