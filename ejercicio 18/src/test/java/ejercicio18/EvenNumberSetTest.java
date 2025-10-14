package ejercicio18;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberSetTest {
    private EvenNumberSet<Integer> set;
    private Even2<Integer> set2;

    @BeforeEach
    void setUp(){
        this.set = new EvenNumberSet<Integer>();
        this.set2 = new Even2<Integer>();
    }

    @Test
    void testAdd(){
        // Set 1
        assertFalse(set.add(1));
        assertTrue(set.add(2));
        assertTrue(set.add(8));
        assertFalse(set.add(8));
        // Set 2
        assertFalse(set2.add(1));
        assertTrue(set2.add(2));
        assertTrue(set2.add(8));
        assertFalse(set2.add(8));
    }
}
