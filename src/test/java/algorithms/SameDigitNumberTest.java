package algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameDigitNumberTest {

    private SameDigitNumber sameDigitNumber = new SameDigitNumber();


    @Test
    public void should_return_true_when_given_1_and_1() {
        // GIVEN
        int number1 = 1;
        int number2 = 1;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void should_return_true_when_given_1234_and_12() {
        // GIVEN
        int number1 = 1234;
        int number2 = 12;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void should_return_true_when_given_12_and_21() {
        // GIVEN
        int number1 = 12;
        int number2 = 21;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void should_return_false_when_given_11_and_12() {
        // GIVEN
        int number1 = 11;
        int number2 = 12;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void should_return_true_when_given_123_and_321() {
        // GIVEN
        int number1 = 123;
        int number2 = 321;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void should_return_false_when_given_56_and_566() {
        // GIVEN
        int number1 = 56;
        int number2 = 566;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(false);
    }


    @Test
    public void should_return_false_when_given_556_and_555() {
        // GIVEN
        int number1 = 556;
        int number2 = 555;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void should_return_false_when_given_121_and_212() {
        // GIVEN
        int number1 = 121;
        int number2 = 212;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void should_return_false_when_given_121110_and_212100() {
        // GIVEN
        int number1 = 121110;
        int number2 = 212100;
        // WHEN
        boolean result = sameDigitNumber.isATwinNumber(number1, number2);
        //THEN
        Assertions.assertThat(result).isEqualTo(false);
    }
}
