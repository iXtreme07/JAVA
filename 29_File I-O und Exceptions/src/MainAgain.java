public class MainAgain {
    public static void main(String[] args) {
        int[] time = {23, 59};
        String strTime;
        int counter = 1441; // this are 24 h and one minute
        boolean munter = false;
        boolean angezogen = false;
        int schlummerTaste = 0;


        while (counter != 0) {
            Time.further(time);
            strTime = time[0] + ":" + time[1];
            System.out.println(time[0] + ":" + time[1]);
            counter--;


            if (time[0] == 6 && time[1] >= 30) {
                try {
                    schlummerTaste = schlummerTasteDrücken(schlummerTaste, munter);
                } catch (Verschlafen e) {
                    munter = aufstehen(munter);
                    schlummerTaste = 0;
                }
            }

        }

    }

    public static Boolean aufstehen(boolean munter) {
        return true;
    }

    public static int schlummerTasteDrücken (int anzahl, boolean munter) throws Verschlafen {
        if (anzahl > 2 && !munter) {
            System.out.println("VERSCHLAFEN!");

        } else if (!munter) {
            System.out.println("Schlummertaste!");
            return anzahl + 1;
        }
        return 0;
    }

}
