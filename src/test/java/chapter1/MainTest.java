package chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(20, product.amount);
        five.times(3);
        assertEquals(20, product.amount);
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
