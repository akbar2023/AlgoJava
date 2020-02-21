package algorithms;

public class OneDay {

//    public static void main(String[] args) {
//        OneDay oneDay = new OneDay();
//        System.out.println(oneDay.findDay("Dimanche", 3));
//    }

    public static String findDay(String today, int offset) {

        String[] days = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

//        int i1 = Arrays.asList(days).indexOf(today);
//        System.out.println(i1);

        for (int i = 0; i < 7; i++) {
            if (today.equals(days[i])) {
                while (offset < 0) {
                    offset += 7;
                }

                offset += i;
                int index = offset % 7;
                String day = days[index];
                return day;

            }
        }
        return "Not Found";
    }
}
