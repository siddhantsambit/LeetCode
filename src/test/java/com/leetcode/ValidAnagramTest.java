package com.leetcode;

import com.leetcode.problems.ValidAnagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    private ValidAnagram validAnagram;
    private String s;
    private String t;

    @BeforeEach
    public void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    public void test1() {
        s = "anagram";
        t = "nagaram";
        Assertions.assertEquals(true, validAnagram.isAnagram(s, t));
    }

    @Test
    public void test2() {
        s = "rat";
        t = "car";
        Assertions.assertEquals(false, validAnagram.isAnagram(s, t));
    }
}
