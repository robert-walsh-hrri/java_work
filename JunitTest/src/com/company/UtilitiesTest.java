package com.company;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() throws Exception {
        Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCDEF",util.removePairs("AABCDDEFF"));
    }

    @org.junit.Test
    public void removePairsCs() throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter() throws Exception {
        fail("converter fails");
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        fail("null if odd length fails");
    }
}