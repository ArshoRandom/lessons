package am.picsart.lessons.lesson4.artillery;

import am.picsart.lessons.lesson4.base.AbstractHeavyLongRangeWeapon;

public class AutomotiveArtillery extends Artillery {

    private String platformType;

    public AutomotiveArtillery() {
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

}
