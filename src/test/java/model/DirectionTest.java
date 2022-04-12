package inc.faregh.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DirectionTest {

    private static Direction d;

    @BeforeAll
    static void setUp() {
        d = Direction.D;
    }

    @Test
    void Ordinal(){
        Assertions.assertEquals(d.ordinal(),2);
    }
}