package com.leetcode;

import com.leetcode.problems.FloodFill;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FloodFillTest {

    private FloodFill floodFill;
    private int[][] image;
    private int color, sr, sc;

    @BeforeEach
    public void setUp() {
        floodFill = new FloodFill();
    }

    @Test
    public void test1() {
        image = new int[][]{
                {1, 1, 1,},
                {1, 1, 0},
                {1, 0, 1}
        };
        sr = 1; sc =1; color = 2;
        image = floodFill.floodFill(image, sr, sc, color);
        Assertions.assertEquals(color, image[sr][sc]);
        Assertions.assertEquals(color, image[0][0]);
        Assertions.assertEquals(color, image[0][1]);
        Assertions.assertEquals(color, image[0][2]);
        Assertions.assertEquals(color, image[1][0]);
        Assertions.assertEquals(color, image[2][0]);
    }

    @Test
    public void test2() {
        image = new int[][] {
                {0, 0, 0},
                {0, 0, 0}
        };
        sr = 0; sc = 0; color = 0;
        image = floodFill.floodFill(image, sr, sc, color);
        Assertions.assertEquals(color, image[sr][sc]);
    }

    @Test
    public void test3() {
        image = new int[][]{
                {5, 2, 1, 5, 6, 3, 2, 0, 6, 9},
                {0, 9, 5, 4, 2, 9, 5, 2, 0, 4},
                {0, 3, 3, 3, 1, 8, 1, 7, 3, 1},
                {0, 1, 1, 6, 8, 7, 4, 9, 1, 2},
                {1, 3, 4, 8, 2, 5, 1, 6, 2, 2},
                {5, 5, 8, 1, 2, 7, 2, 3, 9, 3},
                {2, 6, 2, 0, 1, 7, 0, 9, 4, 6},
                {9, 5, 0, 7, 6, 6, 7, 8, 4, 2},
                {3, 4, 9, 3, 4, 8, 2, 8, 9, 4},
                {4, 9, 1, 3, 9, 5, 4, 9, 1, 3}
        };
        sr = 3; sc = 8; color = 9;
        image = floodFill.floodFill(image, sr, sc, color);
        Assertions.assertEquals(color, image[sr][sc]);
    }
}
