package com.company;

import junit.framework.TestCase;
import static com.company.arrayq2.checkUnqiue;


/**
 * Created by Dean Hermanudin on 3/13/16.
 */
public class arrayq2Test extends TestCase {

    public void testCheckUnqiue() throws Exception {
        assertEquals(checkUnqiue("abcdefg"), true);
        assertEquals(checkUnqiue("1234567"), true);
        assertEquals(checkUnqiue("abcdaab"), false);
        assertEquals(checkUnqiue("asdbhjdsfgsd6f80"), false);
    }
}