package am.picsart.lessons.lesson6.constants;

import java.util.GregorianCalendar;

public interface StudentsDefaults {

    char GENDER_DEFAULT = 'm';
    String NAME_SURNAME_DEFAULT = "ANONYMOUS";
    int YEAR_DEFAULT = getCurrentYear();
    double MARK_DEFAULT = 0.0;


    private static int getCurrentYear() {
        return GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
    }
}
