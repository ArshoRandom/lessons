package am.picsart.lessons.lesson4;

import am.picsart.lessons.lesson4.rocketweapons.airdefence.AirDefenceRocketSystem;
import am.picsart.lessons.lesson4.artillery.Artillery;
import am.picsart.lessons.lesson4.artillery.AutomotiveArtillery;
import am.picsart.lessons.lesson4.base.HeavyLongRangeWeapon;
import am.picsart.lessons.lesson4.rocketweapons.MultipleRocketLauncher;
import am.picsart.lessons.lesson4.rocketweapons.RocketLongRangeWeapon;

public class Lesson4WeaponsDemo {

    public static void main(String[] args) {

        HeavyLongRangeWeapon heavyLongRangeWeapon = new HeavyLongRangeWeapon();
        heavyLongRangeWeapon.setCountry("USSR");
        heavyLongRangeWeapon.setCaliber(82);
        heavyLongRangeWeapon.setModel("BM 36");
        heavyLongRangeWeapon.setDistance(3000);
        heavyLongRangeWeapon.setPersonnelCount(3);
        heavyLongRangeWeapon.printCharacteristics();
        System.out.println("--------------------------------");

        Artillery artillery = new Artillery();
        artillery.setModel("D30");
        artillery.setCountry("USSR");
        artillery.setDistance(15000);
        artillery.setCaliber(122);
        artillery.setPersonnelCount(6);
        artillery.setFlat(false);
        artillery.printCharacteristics();
        System.out.println("--------------------------------");

        MultipleRocketLauncher multipleRocketLauncher = new MultipleRocketLauncher();
        multipleRocketLauncher.setCountry("USSR");
        multipleRocketLauncher.setModel("MRL30 Smerch");
        multipleRocketLauncher.setCaliber(300);
        multipleRocketLauncher.setDistance(120_000);
        multipleRocketLauncher.setPersonnelCount(4);
        multipleRocketLauncher.setRocketCount(12);
        multipleRocketLauncher.setRateOfFire(40);
        multipleRocketLauncher.printCharacteristics();
        System.out.println("--------------------------------");

        AutomotiveArtillery automotiveArtillery = new AutomotiveArtillery();
        automotiveArtillery.setCountry("Sweden");
        automotiveArtillery.setFlat(false);
        automotiveArtillery.setModel("Archer");
        automotiveArtillery.setCaliber(155);
        automotiveArtillery.setDistance(30000);
        automotiveArtillery.setPersonnelCount(3);
        automotiveArtillery.setPlatformType("Volvo");
        automotiveArtillery.printCharacteristics();

        System.out.println("--------------------------------");
        RocketLongRangeWeapon rocketLongRangeWeapon = new RocketLongRangeWeapon();
        rocketLongRangeWeapon.setRocketCount(1);
        rocketLongRangeWeapon.setCountry("USSR");
        rocketLongRangeWeapon.setCaliber(640);
        rocketLongRangeWeapon.setDistance(120000);
        rocketLongRangeWeapon.setModel("Tochka U");
        rocketLongRangeWeapon.setPersonnelCount(3);
        rocketLongRangeWeapon.printCharacteristics();

        System.out.println("--------------------------------");
        AirDefenceRocketSystem airDefenceRocketSystem = new AirDefenceRocketSystem();
        airDefenceRocketSystem.setCountry("Russia");
        airDefenceRocketSystem.setModel("BUK M1");
        airDefenceRocketSystem.setPersonnelCount(4);
        airDefenceRocketSystem.setDetectionRadius(150000);
        airDefenceRocketSystem.setDistance(45000);
        airDefenceRocketSystem.setRocketCount(4);
        airDefenceRocketSystem.setCaliber(400);
        airDefenceRocketSystem.printCharacteristics();

    }



}
