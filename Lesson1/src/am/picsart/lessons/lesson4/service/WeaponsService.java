package am.picsart.lessons.lesson4.service;

import am.picsart.lessons.lesson4.base.AbstractHeavyLongRangeWeapon;

public interface WeaponsService {

    void printCharacteristics(AbstractHeavyLongRangeWeapon abstractHeavyLongRangeWeapon);

    int getCountOfDefenders(AbstractHeavyLongRangeWeapon weapon, double frontLength, double targetDepth);

}
