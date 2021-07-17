package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int i) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[i][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int i) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
