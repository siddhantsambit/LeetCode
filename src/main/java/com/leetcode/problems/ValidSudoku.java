package com.leetcode.problems;

import java.util.HashSet;

public class ValidSudoku {

    /*
    * LeetCode-36 ValidSudoku
    * Time Complexity - O(n^2) -> O(81), as n is constant of length 9 over here
    * Space Complexity - O(n^3) -> O(729), worst case
    */

    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();
        char board[][] = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(validSudoku.isValidSudoku(board));

        board = new char[][] {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(validSudoku.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (set.contains(num + "_R_" + i)
                            || set.contains(num + "_C_" + j)
                            || set.contains(num + "_B_" + i / 3 + "_" + j / 3))
                        return false;
                    else {
                        set.add(num + "_R_" + i);
                        set.add(num + "_C_" + j);
                        set.add(num + "_B_" + i / 3 + "_" + j / 3);
                    }
                }
            }
        }
        return true;
    }
}
