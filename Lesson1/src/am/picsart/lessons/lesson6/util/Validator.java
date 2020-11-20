package am.picsart.lessons.lesson6.util;

import am.picsart.lessons.lesson6.constants.StudentsDefaults;

public class Validator {

    public static boolean isValidNameOrSurname(String data) {
        if (!data.trim().isEmpty()) {
            for (int i = 0; i < data.length(); i++) {
                if (!Character.isLetter(data.charAt(i)))
                    return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isValidBirthYear(int year) {
        return year >= 1700 && year <= StudentsDefaults.YEAR_DEFAULT;
    }

    public static boolean isValidGender(char gender) {
        return gender == 'm' || gender == 'f';

    }

    public static boolean isValidMark(double mark) {
        return mark >= 0 && mark <= 100;
    }

}
