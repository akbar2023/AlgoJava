package algorithms;

public class TwinNumber {

    public boolean isATwinNumber(int localNumber, int foreignNumber) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb.append(localNumber);
        sb2.append(foreignNumber);

        String numberA = sb.toString();
        String numberB = sb2.toString();


        if (numberA.length() == numberB.length()) {
            String[] split1 = {};
            String[] split2 = {};
            for (int i = 0; i < numberA.length(); i++) {
                split1 = numberA.split("");
                split2 = numberB.split("");
            }
            for(String a : split1) {
                for(int j = 0; j < numberA.length(); j++) {
                    if(a.equals(split2[j])) {
                        System.out.println();
                        return true;
                    }
                }
            }
            return true;
        }
        return true;
    }
}
