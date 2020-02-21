package algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OneDayTest {

    private OneDay oneDay = new OneDay();

    @Test
    public void testOneDay() {
//        assertEquals("Mardi", OneDay.findDay("Lundi", 1));
//        assertEquals("Mercredi", OneDay.findDay("Lundi", 2));
//        assertEquals("Vendredi", OneDay.findDay("Mardi", 3));
//        assertEquals("Lundi", OneDay.findDay("Mardi", -1));
    }

    @Test
    public void should_return_Mardi_when_day_is_Lundi_and_offset_is_1() {
        // GIVEN
        String day = "Lundi";
        int offset = 1;
        // WHEN
        String result = oneDay.findDay(day, offset);
        // THEN
        Assertions.assertThat(result).isEqualTo("Mardi");
    }

    @Test
    public void should_return_Mercredi_when_day_is_Lundi_and_offset_is_2() {
        // GIVEN
        String day = "Lundi";
        int offset = 2;
        // WHEN
        String result = oneDay.findDay(day, offset);
        // THEN
        Assertions.assertThat(result).isEqualTo("Mercredi");
    }

    @Test
    public void should_return_Lundi_when_day_is_Lundi_and_offset_is_7() {
        // GIVEN
        String day = "Lundi";
        int offset = 7;
        // WHEN
        String result = oneDay.findDay(day, offset);
        // THEN
        Assertions.assertThat(result).isEqualTo("Lundi");
    }

    @Test
    public void should_return_Dimanche_when_day_is_Lundi_and_offset_is_minus_1() {
        // GIVEN
        String day = "Lundi";
        int offset = -1;
        // WHEN
        String result = oneDay.findDay(day, offset);
        // THEN
        Assertions.assertThat(result).isEqualTo("Dimanche");
    }
}
