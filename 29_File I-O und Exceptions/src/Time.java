public class Time {

    public static int[] further(int[] time) {

        if (time[1] == 59) {
            time[1] = 0;
            time[0]++;
        } else {
            time[1]++;
        }
        if (time[0] == 24) {
            time[0] = 0;
        }
        return time;
    }


}
