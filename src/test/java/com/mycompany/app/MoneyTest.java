package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(10).equals(Money.dollar(10)));
        assertFalse(Money.dollar(11).equals(Money.dollar(10)));
        assertTrue(Money.franc(10).equals(Money.franc(10)));
        assertFalse(Money.franc(11).equals(Money.franc(10)));
        assertFalse(Money.franc(10).equals(Money.dollar(10)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
}
