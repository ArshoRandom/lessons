package am.picsart.lessons.lesson4.artillery;

import am.picsart.lessons.lesson4.base.AbstractHeavyLongRangeWeapon;

public class AutomotiveAbstractHeavyLongRangeWeapon extends AbstractHeavyLongRangeWeapon {

    private String platformType;

    public AutomotiveAbstractHeavyLongRangeWeapon() {
        this.platformType = this.defaultStrValue;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        if (platformType != null && platformType.length() > 1)
            this.platformType = platformType;
        else
            System.out.println("Invalid platform type : " + platformType);
    }


    @Override
    public void printCharacteristics() {
        super.printCharacteristics();
        System.out.printf("Platform type : %s\n", platformType);
    }
}
