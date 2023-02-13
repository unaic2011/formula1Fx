package eus.ehu.test;

import eus.ehu.data_access.DbAccessManager;

public class Main {
    public static void main(String[] args) {
        DbAccessManager dataManager = DbAccessManager.getInstance();
        dataManager.storePilot("Lewis Hamilton", "British", 380);
        // Include here additional instructions for another 6 pilots. You can
        // get info at https://www.formula1.com/en/drivers.html
        dataManager.storePilot("Carlos Sainz", "Spanish", 782);
        dataManager.storePilot("George Russell", "British", 294);
        dataManager.storePilot("Lewis Hamilton", "British", 4405);
        dataManager.storePilot("Zhou Guanyu", "Chinese", 6);
        dataManager.storePilot("Lando Norris", "British", 428);
        dataManager.storePilot("Fernando Alonso", "Spanish", 2061);
        System.out.println(dataManager.getAllPilots());
        System.out.println(dataManager.getPilotsByNationality("British"));
        dataManager.getAllPilots().
    }

}
