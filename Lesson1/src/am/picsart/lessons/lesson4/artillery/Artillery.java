package am.picsart.lessons.lesson4.artillery;

import am.picsart.lessons.lesson4.base.AbstractHeavyLongRangeWeapon;

public class Artillery extends AbstractHeavyLongRangeWeapon {

    private boolean isFlat;

    public boolean isFlat() {
        return isFlat;
    }

    public void setFlat(boolean flat) {
        isFlat = flat;
    }
}
