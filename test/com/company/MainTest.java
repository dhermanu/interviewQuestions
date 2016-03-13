package com.company;

import junit.framework.TestCase;

import static com.company.Main.isPermutation;

/**
 * Created by Dean Hermanudin on 3/13/16.
 */
public class MainTest extends TestCase {

    public void testIsPermutation() throws Exception {
        assertEquals(isPermutation("cat", "tac"), true);
        assertEquals(isPermutation("hahaha", "haha"), false);
        assertEquals(isPermutation("123", "123"), true);
        assertEquals(isPermutation("food", "fodo"), true);
        assertEquals(isPermutation("hehe", "huhu"), false);
        assertEquals(isPermutation("tic", "cit"), true);
        assertEquals(isPermutation("hack", "chak"), true);
        assertEquals(isPermutation("hho", "ohh"), true);
    }
}