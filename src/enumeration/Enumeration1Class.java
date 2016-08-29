package enumeration;

/**
 * Created by mrahbari on 06/13/2015.
 */
public class Enumeration1Class {

    enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);

        private int value;

        private Season(int value) {
            this.value = value;
        }
    }



    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
    enum Day2 {ali, reza, mohammad};
    public static void main(String argv[]) {

        for (Season s : Season.values()) {
            System.out.print(s + " " + s.value + " ");
        }

        // Java enum in switch statement
        System.out.println();
        Day d = Day.FRIDAY;
        switch(d) {
            case SATURDAY:
                System.out.println("Saturday");
                break;

            case FRIDAY:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Other days");
        }


        // Java enum in switch statement
        Day2 d2 = Day2.mohammad;
        switch(d2) {
            case mohammad:
                System.out.print("Welcome mohmmad");
                break;

            default:
        }



    }
}
