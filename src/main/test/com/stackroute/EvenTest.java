package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.*;

public class EvenTest {
    Even number;

    @Before
    public void setUp() throws Exception {
        number = new Even();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsIntegerEven() {
        boolean actualValue = number.isEven(6);
        assertTrue(actualValue);

    }

    @Test
    public void testIsIntegerOdd() {
        boolean actualValue = number.isEven(7);
        assertFalse(actualValue);
    }

}