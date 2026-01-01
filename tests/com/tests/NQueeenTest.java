package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NQueenTest {

    @Test
    @DisplayName("Test N=1: Should return a 1x1 board with one queen")
    void testNOne() {
        int[][] board = QueenPlace.NQueenBoard(1);
        assertEquals(1, board.length);
        assertEquals(1, board[0][0], "A 1x1 board must have a queen at [0][0]");
    }

    @Test
    @DisplayName("Test N=2 and N=3: Should return empty boards (no solution exists)")
    void testNoSolutionBoards() {
        // For N=2, the code should return a board filled with 0s as findRoute returns false
        int[][] board2 = QueenPlace.NQueenBoard(2);
        assertFalse(containsQueen(board2), "N=2 board should not contain any queens");

        // For N=3, same logic applies
        int[][] board3 = QueenPlace.NQueenBoard(3);
        assertFalse(containsQueen(board3), "N=3 board should not contain any queens");
    }

    @Test
    @DisplayName("Test N=4: Verify a valid solution is produced")
    void testNFour() {
        int n = 4;
        int[][] board = QueenPlace.NQueenBoard(n);

        assertTrue(isValidNQueenSolution(board, n), "N=4 solution must follow N-Queens rules");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8})
    @DisplayName("Test various valid N sizes: Verify constraints")
    void testLargeBoards(int n) {
        int[][] board = QueenPlace.NQueenBoard(n);
        assertTrue(isValidNQueenSolution(board, n), "Solution for N=" + n + " must be valid");
    }

    // --- Helper Methods for Validation ---

    private boolean containsQueen(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 1) return true;
            }
        }
        return false;
    }

    private boolean isValidNQueenSolution(int[][] board, int n) {
        int queenCount = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 1) {
                    queenCount++;
                    if (!isSafe(board, r, c, n)) return false;
                }
            }
        }
        return queenCount == n;
    }

    private boolean isSafe(int[][] board, int row, int col, int n) {
        // Directions: Up, Down, Left, Right, and 4 Diagonals
        int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};

        for (int i = 0; i < 8; i++) {
            int r = row + dr[i];
            int c = col + dc[i];
            while (r >= 0 && r < n && c >= 0 && c < n) {
                if (board[r][c] == 1) return false;
                r += dr[i];
                c += dc[i];
            }
        }
        return true;
    }
}