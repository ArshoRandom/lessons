package am.picsart.lessons.lesson4.base;

import am.picsart.lessons.lesson4.base.HeavyLongRangeWeapon;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Artillery implements HeavyLongRangeWeapon {

    private String model;
    private String country;
    private double distance;
    private int personnelCount;
    private double caliber;
    private int year;

    protected String defaultStrValue = "SECRET";


    public Artillery() {
        this.model = this.defaultStrValue;
        this.country = this.defaultStrValue;
        this.caliber = 120;
        this.personnelCount = 5;
        this.distance = 5000;
        this.year = 2000;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String currentYear = sdf.format(new Date());
        if (year >= 1950 && year <= Integer.parseInt(currentYear))
            this.year = year;
        else
            System.out.println("Invalid year : " + year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && model.length() > 0)
            this.model = model;
        else
            System.out.println("Invalid model : " + model);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && country.matches("[a-zA-Z]+"))
            this.country = country;
        else
            System.out.println("invalid country : " + country);
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        if (caliber > 60 && caliber < 800)
            this.caliber = caliber;
        else
            System.out.println("Invalid caliber : " + caliber);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if (distance >= 3000 && distance <= 700_000)
            this.distance = distance;
        else
            System.out.println("Invalid distance : " + distance);
    }

    public int getPersonnelCount() {
        return personnelCount;
    }

    public void setPersonnelCount(int personnelCount) {
        if (personnelCount > 0 && personnelCount <= 30)
            this.personnelCount = personnelCount;
        else
            System.out.println("Invalid personal count : " + personnelCount);
    }

    @Override
    public boolean isEffective(double distance) {
        return !(this.distance < distance);
    }

    @Override
    public boolean isSubjectOfUpdate() {
        return this.year >= 1980;
    }

    @Override
    public boolean notSuitable() {
        return this.year < 1980;
    }
}
