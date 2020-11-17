package am.picsart.lessons.lesson4.service.impl;

import am.picsart.lessons.lesson4.base.AbstractHeavyLongRangeWeapon;
import am.picsart.lessons.lesson4.service.WeaponsService;

public class WeaponsServiceImpl implements WeaponsService {


    @Override
    public void printCharacteristics(AbstractHeavyLongRangeWeapon abstractHeavyLongRangeWeapon) {
        String model = abstractHeavyLongRangeWeapon.getModel();
        System.out.println("\n-+-+-+-+-+-+ " + model + " -+-+-+-+-+-+");
        System.out.printf("Model : %s\n", model);
        System.out.printf("Country : %s\n", abstractHeavyLongRangeWeapon.getCountry());
        System.out.printf("Distance : %f\n", abstractHeavyLongRangeWeapon.getDistance());
        System.out.printf("Personal count : %d\n", abstractHeavyLongRangeWeapon.getPersonnelCount());
        System.out.printf("Caliber : %f\n", abstractHeavyLongRangeWeapon.getCaliber());
        System.out.printf("Year of production : %d\n", abstractHeavyLongRangeWeapon.getYearOfProduction());

    }

    @Override
    public int getCountOfDefenders(AbstractHeavyLongRangeWeapon weapon, double frontLength, double targetDepth) {
        double weaponDistance = weapon.getDistance();
        if (weapon.isEffective(targetDepth)){
            int unitCounts = (int) (frontLength / weapon.getDistance() + 1);
            if (weapon.getCaliber() < 300)
                return 3 * unitCounts;
            else if (weapon.getCaliber() < 600){
                return 2 * unitCounts;
            }
            else
                return unitCounts;

        }
        System.out.println("Ineffective weapon for distance " + weaponDistance);
        return 0;
    }
}
