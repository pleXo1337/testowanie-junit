package com.junit.test;

import com.junit.classes.Positive;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPositive {
    Positive positive;

    @Before
    public void initialize(){
        positive = new Positive();
    }

    @Test
    public void checkIfPositive() {
        assertTrue(positive.isPositive(123));
        assertFalse(positive.isPositive(-123));
    }

    @Test
    public void checkIfZero() {
        assertEquals(positive.getZero(), 0);
    }
}
