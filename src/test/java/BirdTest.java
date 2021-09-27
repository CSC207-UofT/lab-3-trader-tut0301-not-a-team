import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdTest {
    Bird b;

    @Before
    public void setUp() throws Exception {
        b = new Bird();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Biu biu biu", b.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, b.getPrice());
    }
}
