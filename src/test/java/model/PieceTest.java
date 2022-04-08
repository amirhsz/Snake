package inc.faregh.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PieceTest {

    private static Piece b,f;

    @BeforeAll
    static void setup(){
        Point p = new Point(0,0);
        b = new Body(p);
        f = new Fruit(p);
    }
    @Test
    void getP() {
        Assertions.assertEquals(b.getP(),new Point(0,0));
    }

    @Test
    void setP() {
        f.setP(new Point(1,1));
        Assertions.assertEquals(f.getP(),new Point(1,1));
        f.setP(new Point(0,0));
    }

    @Test
    void equal(){
        Assertions.assertTrue(f.equals(b));
        Assertions.assertTrue(b.equals(f));
        Assertions.assertFalse(f.equals(new Object()));
        Assertions.assertFalse(b.equals(new Object()));
    }

}