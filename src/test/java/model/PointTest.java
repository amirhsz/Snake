package inc.faregh.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PointTest {

    private static Point point;

    @BeforeAll
    static void setUp() {
        point = new Point(0,0);
    }

    @Test
    void equal(){
        Assertions.assertTrue(point.equals(new Point(0, 0)));
        Assertions.assertFalse(point.equals(new Point(0, 1)));
        Assertions.assertFalse(point.equals(new Point(1, 0)));
        Assertions.assertFalse(point.equals(new Point(1, 1)));
    }

}