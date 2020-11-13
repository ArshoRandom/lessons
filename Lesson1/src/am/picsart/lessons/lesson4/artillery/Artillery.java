package am.picsart.lessons.lesson4.artillery;

import am.picsart.lessons.lesson4.base.HeavyLongRangeWeapon;

public class Artillery extends HeavyLongRangeWeapon {

    private boolean isFlat;


    public boolean isFlat() {
        return isFlat;
    }

    public void setFlat(boolean flat) {
        isFlat = flat;
    }

    @Override
    public void printCharacteristics() {
        super.printCharacteristics();
        System.out.printf("Is flat : %s\n", isFlat);
    }
}
