package aceyourcodinginterview.warmup;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.LCM.findLCM;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LCMTest {

    @Test
    void testLCM() {
        assertEquals(467970912861L, findLCM(761457, 614573));
        assertEquals(630, findLCM(18, 35));
        assertEquals(10, findLCM(10, 10));
    }
}
