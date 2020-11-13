package am.picsart.lessons.lesson4.base;

public class HeavyLongRangeWeapon {


    private String model;
    private String country;
    private double distance;
    private int personnelCount;
    private double caliber;

    protected String defaultStrValue = "SECRET";


    public HeavyLongRangeWeapon() {
        this.model = this.defaultStrValue;
        this.country = this.defaultStrValue;
        this.caliber = 120;
        this.personnelCount = 5;
        this.distance = 5000;
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

    public void printCharacteristics() {
        System.out.printf("Model : %s\n", model);
        System.out.printf("Country : %s\n", country);
        System.out.printf("Distance : %f\n", distance);
        System.out.printf("Personal count : %d\n", personnelCount);
        System.out.printf("Caliber : %f\n", caliber);
    }


}
