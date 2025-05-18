package com.leetcode;

import com.leetcode.problems.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    private BinarySearch binarySearch;
    private int target;
    private int nums[];

    @BeforeEach
    public void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void test1() {
        nums = new int[]{-1,0,3,5,9,12};
        target = 9;
        Assertions.assertEquals(4, binarySearch.search(nums, target));
    }

    @Test
    public void test2() {
        nums = new int[]{-1,0,3,5,9,12};
        target = 2;
        Assertions.assertEquals(-1, binarySearch.search(nums, target));
    }

    @Test
    public void test3() {
        nums = new int[]{-1,0,3,5,9,12};
        target = 13;
        Assertions.assertEquals(-1, binarySearch.search(nums, target));
    }
}
