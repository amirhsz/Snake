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
    void getX() {
        Assertions.assertEquals(point.getX(),0);
    }

    @Test
    void setX() {
        point.setX(1);
        Assertions.assertEquals(point.getX(),1);
        point.setX(0);
    }

    @Test
    void getY() {
        Assertions.assertEquals(point.getY(),0);
    }

    @Test
    void setY() {
        point.setY(1);
        Assertions.assertEquals(point.getY(),1);
        point.setY(0);
    }

    @Test
    void equal(){
        Assertions.assertTrue(point.equals(new Point(0, 0)));
        Assertions.assertFalse(point.equals(new Point(0, 1)));
        Assertions.assertFalse(point.equals(new Point(1, 0)));
        Assertions.assertFalse(point.equals(new Point(1, 1)));
    }

}