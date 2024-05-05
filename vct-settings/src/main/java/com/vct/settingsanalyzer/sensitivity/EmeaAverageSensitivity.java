package com.vct.settingsanalyzer.sensitivity;

import com.vct.settingsanalyzer.Main;
import com.vct.settingsanalyzer.data.EmeaSensitivity;

import java.util.ArrayList;

public class EmeaAverageSensitivity implements SensitivityFunctionality{
    private ArrayList<Double> allSensitivities = new ArrayList<>();
    private ArrayList<Double> allSensitivitiesAt800Dpi  = new ArrayList<>();
    private ArrayList<Double> allSensitivitiesAt1600dpi  = new ArrayList<>();
    private ArrayList<Double> allHighSensitivities = new ArrayList<>();
    private ArrayList<Double> allMidSensitivities = new ArrayList<>();
    private ArrayList<Double> allLowSensitivities = new ArrayList<>();

    @Override
    public void averageSensitivity() {
        for (EmeaSensitivity sensitivity : EmeaSensitivity.values()) {
            allSensitivities.add(sensitivity.getEdpi());
        }
        double allEdpi =
                allSensitivities.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("Edpi: " + allEdpi);
    }

    @Override
    public void averageLowSensitivity() {
        groupLowSensitivity();
        double averageLowSens =
                allLowSensitivities.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("Average Low Sens: " + Math.round(averageLowSens * 1000d) / 1000d);
    }

    @Override
    public void averageMediumSensitivity() {
        groupMediumSensitivity();
        double averageMidSens =
                allMidSensitivities.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("Average Medium Sens: " + Math.round(averageMidSens * 1000d) / 1000d);
    }

    @Override
    public void averageHighSensitivity() {
        groupHighSensitivity();
        double averageHighSens =
                allHighSensitivities.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("Average High Sens: " + Math.round(averageHighSens * 1000d) / 1000d);
    }

    @Override
    public void groupLowSensitivity() {
        for (Double sensitivity : allSensitivitiesAt800Dpi) {
            if (sensitivity < 0.3) {
                allLowSensitivities.add(sensitivity);
            }
        }
        System.out.println(allLowSensitivities);
    }

    @Override
    public void groupMediumSensitivity() {
        for (Double sensitivity : allSensitivitiesAt800Dpi) {
            if (sensitivity > 0.3 && sensitivity < 0.4) {
                allMidSensitivities.add(sensitivity);
            }
        }
        System.out.println(allMidSensitivities);
    }

    @Override
    public void groupHighSensitivity() {
        for (Double sensitivity : allSensitivitiesAt800Dpi) {
            if (sensitivity > 0.4) {
                allHighSensitivities.add(sensitivity);
            }
        }
        System.out.println(allHighSensitivities);
    }

    @Override
    public void convertEdpiToSens() {
        for (Double edpi : allSensitivities) {
            double sensAt800Dpi = Math.round((edpi / 800) * 1000d) / 1000d;
            double sensAt1600Dpi = Math.round((edpi / 1600) * 1000d) / 1000d;

            allSensitivitiesAt800Dpi .add(sensAt800Dpi);
            allSensitivitiesAt1600dpi.add(sensAt1600Dpi);
        }
        double all800dpi =
                allSensitivitiesAt800Dpi.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("800 Dpi: " + Math.round(all800dpi * 1000d) / 1000d);

        double all1600dpi =
                allSensitivitiesAt1600dpi.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("1600 Dpi: " + Math.round(all1600dpi * 1000d) / 1000d);
    }

    public static void main(String[] args) {

        EmeaAverageSensitivity sens = new EmeaAverageSensitivity();
        sens.averageSensitivity();
        sens.convertEdpiToSens();
        sens.averageLowSensitivity();
        sens.averageMediumSensitivity();
        sens.averageHighSensitivity();
    }
}
