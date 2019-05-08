package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePalindromeTest {
    Reversepalindrome reverse;

    @Before
    public void setUp() throws Exception {
        reverse = new Reversepalindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void emptyStringTest() throws Exception {

        Boolean expectedValue = true;

        Boolean actualValue = reverse.checkPalindrome("");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void multipleWhiteSpaceTest() throws Exception {

        Boolean actualValue = reverse.checkPalindrome("malayalam");
        assertTrue(actualValue);


    }
}