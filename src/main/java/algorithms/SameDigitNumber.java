package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class SameDigitNumber {

    public boolean isATwinNumber(int first, int second) {

        String firstNum = String.valueOf(first);
        String secondNum = String.valueOf(second);

        if (first == second) {
            return true;
        }

        if (firstNum.length() != secondNum.length()) {
            return false;
        }

        int length = firstNum.length();

        for (int i = 0; i < length; i++) {
            char letter = firstNum.charAt(0);
            if (!secondNum.contains(Character.toString(letter)) ) {
                return false;
            }
            int i2 = secondNum.indexOf(letter);
            firstNum = firstNum.substring(1);
            secondNum = secondNum.substring(0, i2) + secondNum.substring(i2+1);
        }
        return true;
    }
}
