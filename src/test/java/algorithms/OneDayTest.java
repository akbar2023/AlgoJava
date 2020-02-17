package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneDayTest {

    @Test
    public void testOneDay() {
        assertEquals("Mardi", OneDay.findDay("Lundi", 1));
        assertEquals("Mercredi", OneDay.findDay("Lundi", 2));
        assertEquals("Vendredi", OneDay.findDay("Mardi", 3));
        assertEquals("Lundi", OneDay.findDay("Mardi", -1));
    }
}
