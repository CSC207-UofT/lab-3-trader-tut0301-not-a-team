/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class SpaceshipTest {
    Spaceship s;

    @Before
    public void setUp() throws Exception {
        s = new Spaceship();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(101, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        s.downgradeSpeed();
        assertEquals(99, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, s.getPrice());
    }

}