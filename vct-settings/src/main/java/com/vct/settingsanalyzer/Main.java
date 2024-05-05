package com.vct.settingsanalyzer;

import com.vct.settingsanalyzer.commands.Commands;
import com.vct.settingsanalyzer.roster.Rosters;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Commands commands = new Commands();

        commands.landingCommands();
    }
}