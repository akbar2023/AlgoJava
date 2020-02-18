package algorithms;

public class SayAa {

    public static void main(String[] args) {

        SayAa say = new SayAa();
        try {
            sayAaa("aaa");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }

    public static String sayAaa(String input) {

        String[] separated;
        separated = input.split("");
        StringBuilder newText = new StringBuilder();
        if (input.contains("aaa")) {
            throw new RuntimeException("Erreur");
        } else {
            for (String s : separated) {
                if (newText.length() > 0) {
                    if (!newText.substring(newText.length() - 1).equals("a") && s.equals("a")) {
                        System.out.println(newText.substring(newText.length() - 1));
                        newText.append("aa");
                    } else if (!newText.substring(newText.length() - 1).equals("a") && s.equals("b")) {
                        newText.append("aab");
                        System.out.println(newText);
                    } else if (newText.substring(newText.length() - 1).equals("a") && s.equals("b")) {
                        newText.append("baa");
                    } else if (newText.substring(newText.length() - 1).equals("a") && s.equals("a")) {
                        if (newText.substring(newText.length() - 2).equals("aa")) {
                            System.out.println(newText + " NOTHING HAPPEND");
                        } else {
                            newText.append("a");
                        }
                    } else {
                        System.out.println(newText + " NOTHING HAPPEND");
                    }
                } else if (s.equals("a") || s.equals("")) {
                    newText.append("aa");
                } else if (s.equals("b")) {
                    newText.append("aabaa");
                }
            }
        }
        return newText.toString();
    }
}

