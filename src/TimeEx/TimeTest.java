package TimeEx;

import TimeEx.Time;

public class TimeTest {
    public static void main(String[] args) {

        Time time1 = new Time();

        displayTime("After time object is created", time1);
        System.out.println();

        time1.setTime(13, 27, 6);
        displayTime("After calling setTime", time1);
        System.out.println();

        try {
            time1.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time1);
    }

    private static void displayTime(String header, Time t) {
        System.out.printf("%s%nUniversal time: %s%nStandart time: %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
