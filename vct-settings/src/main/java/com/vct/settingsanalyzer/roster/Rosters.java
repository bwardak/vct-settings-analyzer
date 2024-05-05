package com.vct.settingsanalyzer.roster;

import com.vct.settingsanalyzer.data.EmeaSensitivity;

public class Rosters {

    public void printRosters() {
        int i = 0;
        for (EmeaSensitivity player : EmeaSensitivity.values()) {
            if (i % 5 == 0) {
                System.out.println(" ");
                System.out.println(player.getTeamName().toUpperCase() + ":");
                System.out.println(" ");
            }
            System.out.println(player.toString().charAt(0) + player.toString().substring(1));
            i++;
        }
    }
}
