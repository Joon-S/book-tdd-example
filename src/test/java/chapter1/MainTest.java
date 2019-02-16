package chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertTrue(new Dollar(10).equals(five.times(2)));
        assertTrue(new Dollar(30).equals(five.times(3)));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
