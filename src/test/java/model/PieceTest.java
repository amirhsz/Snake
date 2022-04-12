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
    void equal(){
        Assertions.assertTrue(f.equals(b));
        Assertions.assertTrue(b.equals(f));
        Assertions.assertFalse(f.equals(new Object()));
        Assertions.assertFalse(b.equals(new Object()));
    }

}