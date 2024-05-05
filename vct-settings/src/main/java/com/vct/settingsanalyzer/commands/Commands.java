package com.vct.settingsanalyzer.commands;

import com.vct.settingsanalyzer.roster.Rosters;
import com.vct.settingsanalyzer.sensitivity.EmeaAverageSensitivity;

import java.util.Scanner;

public class Commands {
    Scanner scanner = new Scanner(System.in);
//    EmeaAverageSensitivity s

    public void landingCommands() {
        System.out.println("What do you want to check:");
        System.out.println("1: Rosters");
        System.out.println("2: Sensitivity");
        System.out.println(" ");
        System.out.println("Enter the number: ");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            new Rosters().printRosters();
        } else if (input.equals("2")) {
            sensitivityCommands();
        }
    }

    public void sensitivityCommands() {
        System.out.println("What do you want to check:");
        System.out.println("1: Average statistics");
        System.out.println("2: Sensitivities by team");
        System.out.println("3: Sensitivity by player");
        System.out.println(" ");
        System.out.println("Enter the number: ");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            new EmeaAverageSensitivity().runAverageSensitivityEmea();
        } else if (input.equals("2")) {
            new EmeaAverageSensitivity().sensitivitiesByTeams();
        }
    }
}
