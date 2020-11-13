package am.picsart.lessons.lesson4.rocketweapons.airdefence;

import am.picsart.lessons.lesson4.rocketweapons.RocketLongRangeWeapon;

public class AirDefenceRocketSystem extends RocketLongRangeWeapon {

    private double detectionRadius;

    public AirDefenceRocketSystem() {
        this.detectionRadius = 10;
    }

    public double getDetectionRadius() {
        return detectionRadius;
    }

    public void setDetectionRadius(double detectionRadius) {
        this.detectionRadius = detectionRadius;
    }

    @Override
    public void printCharacteristics() {
        super.printCharacteristics();
        System.out.printf("Detection radius : %f", detectionRadius);
    }
}
