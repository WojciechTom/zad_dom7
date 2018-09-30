package dniTygodnia_71;

public class CalandarConverter {

    final static int MONDAY = 1;
    final static int THUSDAY = 2;
    final static int WEDNESDAY = 3;
    final static int THURSDAY = 4;
    final static int FRIDAY = 5;
    final static int SATURDAY = 6;
    final static int SUNDAY = 7;


    static String convertDayToString(int dayNumber) {

        switch (dayNumber) {

            case MONDAY:
                return "Poniedziałek";

            case THUSDAY:
                return "Wtorek";

            case WEDNESDAY:
                return "środa";

            case THURSDAY:
                return "Czwartek";

            case FRIDAY:
                return "Piątek";

            case SATURDAY:
                return "Sobota";

            case SUNDAY:
                return "Niedziela";

            default:
                return "Nie podałeś liczby od 1 do 7";
        }

    }


}
