package algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TwinNumberTest {

    private TwinNumber twinNumber = new TwinNumber();



    @Disabled
    @Test
    public void should_return_true_when_given_1_and_1() {
        // GIVEN
        int number1 = 1;
        int number2 = 1;
        // WHEN
        boolean result = twinNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo("true");
    }

    @Disabled
    @Test
    public void should_return_true_when_given_12_and_21() {
        // GIVEN
        int number1 = 12;
        int number2 = 21;
        // WHEN
        boolean result = twinNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo("true");
    }

    @Disabled
    @Test
    public void should_return_true_when_given_123_and_321() {
        // GIVEN
        int number1 = 123;
        int number2 = 321;
        // WHEN
        boolean result = twinNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo("true");
    }

    @Disabled
    @Test
    public void should_return_true_when_given_92_and_29() {
        // GIVEN
        int number1 = 12;
        int number2 = 21;
        // WHEN
        boolean result = twinNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo("true");
    }
}
