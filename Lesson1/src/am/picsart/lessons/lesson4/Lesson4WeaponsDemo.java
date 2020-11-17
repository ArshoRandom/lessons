package am.picsart.lessons.lesson4;

import am.picsart.lessons.lesson4.airdefence.AirDefenceRocketSystem;
import am.picsart.lessons.lesson4.artillery.Artillery;
import am.picsart.lessons.lesson4.artillery.AutomotiveArtillery;
import am.picsart.lessons.lesson4.rocketweapons.MultipleRocketLauncher;
import am.picsart.lessons.lesson4.rocketweapons.RocketLongRangeWeapon;
import am.picsart.lessons.lesson4.service.WeaponsService;
import am.picsart.lessons.lesson4.service.impl.WeaponsServiceImpl;

public class Lesson4WeaponsDemo {

    public static void main(String[] args) {

        WeaponsService weaponsService = new WeaponsServiceImpl();

        Artillery artillery = new Artillery();
        artillery.setModel("D30");
        artillery.setCountry("USSR");
        artillery.setDistance(15000);
        artillery.setCaliber(122);
        artillery.setFlat(false);
        artillery.setPersonnelCount(6);
        artillery.setYearOfProduction(2000);
        weaponsService.printCharacteristics(artillery);

        MultipleRocketLauncher multipleRocketLauncher = new MultipleRocketLauncher();
        multipleRocketLauncher.setCountry("USSR");
        multipleRocketLauncher.setModel("MRL30 Smerch");
        multipleRocketLauncher.setCaliber(300);
        multipleRocketLauncher.setDistance(120_000);
        multipleRocketLauncher.setPersonnelCount(4);
        multipleRocketLauncher.setRocketCount(12);
        multipleRocketLauncher.setRateOfFire(40);
        multipleRocketLauncher.setYearOfProduction(1995);
        weaponsService.printCharacteristics(multipleRocketLauncher);

        AutomotiveArtillery automotiveArtillery = new AutomotiveArtillery();
        automotiveArtillery.setCountry("Sweden");
        automotiveArtillery.setModel("Archer");
        automotiveArtillery.setCaliber(155);
        automotiveArtillery.setDistance(30000);
        automotiveArtillery.setPersonnelCount(3);
        automotiveArtillery.setPlatformType("Volvo");
        automotiveArtillery.setFlat(false);
        automotiveArtillery.setYearOfProduction(2007);
        weaponsService.printCharacteristics(automotiveArtillery);

        RocketLongRangeWeapon rocketLongRangeWeapon = new RocketLongRangeWeapon();
        rocketLongRangeWeapon.setRocketCount(1);
        rocketLongRangeWeapon.setCountry("USSR");
        rocketLongRangeWeapon.setCaliber(640);
        rocketLongRangeWeapon.setDistance(120_000);
        rocketLongRangeWeapon.setModel("Tochka U");
        rocketLongRangeWeapon.setPersonnelCount(3);
        rocketLongRangeWeapon.setYearOfProduction(2004);
        weaponsService.printCharacteristics(rocketLongRangeWeapon);

        AirDefenceRocketSystem airDefenceRocketSystem = new AirDefenceRocketSystem();
        airDefenceRocketSystem.setCountry("Russia");
        airDefenceRocketSystem.setModel("BUK M1");
        airDefenceRocketSystem.setPersonnelCount(4);
        airDefenceRocketSystem.setDetectionRadius(150000);
        airDefenceRocketSystem.setDistance(45000);
        airDefenceRocketSystem.setRocketCount(4);
        airDefenceRocketSystem.setCaliber(400);
        airDefenceRocketSystem.setYearOfProduction(1999);
        weaponsService.printCharacteristics(airDefenceRocketSystem);

        int weaponsCountsArtillery = weaponsService.getCountOfDefenders(artillery, 250_000, 5000);
        int weaponsCountsMRL = weaponsService.getCountOfDefenders(multipleRocketLauncher, 250_000, 5000);
        int weaponsCountsAutoArtillery = weaponsService.getCountOfDefenders(automotiveArtillery, 250_000, 5000);
        int weaponsCountsRockets = weaponsService.getCountOfDefenders(rocketLongRangeWeapon, 250_000, 5000);
        int weaponsCountsADS = weaponsService.getCountOfDefenders(airDefenceRocketSystem, 250_000, 5000);

        System.out.println();
        System.out.println("For 250km front length and 10km dept targets");
        System.out.println("Artillery - " + weaponsCountsArtillery);
        System.out.println("MRL - " + weaponsCountsMRL);
        System.out.println("Rockets - " + weaponsCountsRockets);
        System.out.println("Automatic artillery - " + weaponsCountsAutoArtillery);
        System.out.println("ADS - " + weaponsCountsADS);

        artillery.isSubjectOfUpdate();


    }


}
