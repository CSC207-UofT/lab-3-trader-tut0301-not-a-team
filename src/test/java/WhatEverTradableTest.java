
import org.junit.*;

import static org.junit.Assert.*;


public class WhatEverTradableTest {

    WhatEverTradable w;

    @Before
    public void setUp() throws Exception {
        w = new WhatEverTradable();
    }


    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("It makes a sound", w.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, w.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        w.downgradeSpeed();
        assertEquals(50, w.getMaxSpeed());
        w.downgradeSpeed();
        assertEquals(0, w.getMaxSpeed());
        w.downgradeSpeed();
        assertEquals(0, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, w.getPrice());
    }
}
