package am.picsart.lessons.lesson4.rocketweapons;

import am.picsart.lessons.lesson4.base.HeavyLongRangeWeapon;

public class RocketLongRangeWeapon extends HeavyLongRangeWeapon {

    private int rocketCount;

    public RocketLongRangeWeapon() {
        this.rocketCount = 1;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        if (rocketCount > 0 && rocketCount <= 50)
            this.rocketCount = rocketCount;
        else
            System.out.println("Invalid rockets count : " + rocketCount);
    }

    @Override
    public void printCharacteristics() {
        super.printCharacteristics();
        System.out.printf("Rockets count : %d\n", rocketCount);
    }
}
