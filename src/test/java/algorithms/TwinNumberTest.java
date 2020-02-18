package algorithms;

public class TwinNumberTest {

    private TwinNumber twinNumber = new TwinNumber();



    @Test
    public void should_return_true_when_given_12_and_21() {
        // GIVEN
        int number1 = 12;
        int number2 = 21;
        // WHEN
        boolean result = twinNumber.isATwinNumber(number1, number2);
        //THEN
//        Assertions.assertThat(result).isEqualTo("true");
    }
}
