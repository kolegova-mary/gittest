import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestClass {

    Double b = 55.3;

    @Before
    public void init() {
        b = 23.4;
    }

    @Test
    public void test1() {
        int a = (5 + 5) * 5;

        assertEquals(50,a);
        assertEquals(23.4, b);
    }

    @Test
    public void test2() {
        int a = (5 + 6) * 5;

        assertEquals(55,a);
    }
}
