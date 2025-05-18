package com.leetcode;

import com.leetcode.problems.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    private ValidPalindrome validPalindrome;
    private String str;

    @BeforeEach
    public void setUp() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void test1() {
        str = "A man, a plan, a canal: Panama";
        Assertions.assertEquals(true, validPalindrome.isPalindrome(str));
    }

    @Test
    public void test2() {
        str = "race a car";
        Assertions.assertEquals(false, validPalindrome.isPalindrome(str));
    }

    @Test
    public void test3() {
        str = " ";
        Assertions.assertEquals(true, validPalindrome.isPalindrome(str));
    }
}
