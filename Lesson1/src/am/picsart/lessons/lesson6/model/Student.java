package am.picsart.lessons.lesson6.model;

import am.picsart.lessons.lesson6.constants.StudentsDefaults;
import am.picsart.lessons.lesson6.util.Validator;

public class Student {

    private String name;
    private String surname;
    private int birthYear;
    private char gender;
    private double mark;

    public Student() {
        this.name = StudentsDefaults.NAME_SURNAME_DEFAULT;
        this.surname = StudentsDefaults.NAME_SURNAME_DEFAULT;
        this.birthYear = StudentsDefaults.YEAR_DEFAULT;
        this.gender = StudentsDefaults.GENDER_DEFAULT;
        this.mark = StudentsDefaults.MARK_DEFAULT;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Validator.isValidNameOrSurname(name))
            this.name = name;
        else
            this.name = StudentsDefaults.NAME_SURNAME_DEFAULT;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (Validator.isValidNameOrSurname(surname))
            this.surname = surname;
        else
            this.surname = StudentsDefaults.NAME_SURNAME_DEFAULT;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (Validator.isValidBirthYear(birthYear))
            this.birthYear = birthYear;
        else
            this.birthYear = StudentsDefaults.YEAR_DEFAULT;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (Validator.isValidGender(gender))
            this.gender = gender;
        else
            this.gender = StudentsDefaults.GENDER_DEFAULT;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (Validator.isValidMark(mark))
            this.mark = mark;
        else
            this.mark = StudentsDefaults.MARK_DEFAULT;
    }


    @Override
    public String toString() {
        return "Student : " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", mark=" + mark;

    }
}
