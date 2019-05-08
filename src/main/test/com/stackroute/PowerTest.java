package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.Boolean;

import static org.junit.Assert.*;

public class PowerTest {
    Power powerobject;
    int num;

    @Before
    public void setUp() throws Exception {
        powerobject = new Power();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test

    public void testEmptyPower() throws Exception {

        boolean expectedValue = true;
        boolean actualValue = powerobject.getDisplay(16);
    }
    @Test

    public void testinvalidPower() throws Exception{
        boolean expectedValue=true;
        boolean actaulValue=powerobject.getDisplay(44);
        assertNotEquals(expectedValue,actaulValue);

    }
}