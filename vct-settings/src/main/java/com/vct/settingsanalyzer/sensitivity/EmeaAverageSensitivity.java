package com.vct.settingsanalyzer.sensitivity;

import com.vct.settingsanalyzer.data.EmeaSensitivity;

import java.util.ArrayList;

public class EmeaAverageSensitivity implements SensitivityFunctionality{
    private ArrayList<Double>  allSensitivities = new ArrayList<>();
    private ArrayList<Double> allSensitiviesAt800Dpi = new ArrayList<>();
    private ArrayList<Double> allSensitiviesAt1600dpi = new ArrayList<>();
    @Override
    public void averageSensitivity() {
        for (EmeaSensitivity sensitivity : EmeaSensitivity.values()) {
            allSensitivities.add(sensitivity.getEdpi());
        }
        System.out.println(allSensitivities);
    }

    @Override
    public void averageLowSensitivity() {

    }

    @Override
    public void averageMediumSensitivity() {

    }

    @Override
    public void averageHighSensitivity() {

    }

    @Override
    public void groupLowSensitivity() {

    }

    @Override
    public void groupMediumSensitivity() {

    }

    @Override
    public void groupHighSensitivity() {

    }

    @Override
    public void convertEdpiToSens() {
        averageSensitivity();
        for (Double edpi : allSensitivities) {
            double sensAt800Dpi = edpi / 800;
            double sensAt1600Dpi = edpi / 1600;

            allSensitiviesAt800Dpi.add(sensAt800Dpi);
            allSensitiviesAt1600dpi.add(sensAt1600Dpi);
        }
    }

    public static void main(String[] args) {
        EmeaAverageSensitivity sens = new EmeaAverageSensitivity();

        sens.averageSensitivity();
        sens.convertEdpiToSens();
        double allEdpi =
                sens.allSensitivities.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("Edpi: " + allEdpi);

        double all800dpi =
                sens.allSensitiviesAt800Dpi.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("800 Dpi: " + Math.round(all800dpi * 1000d) / 1000d);

        double all1600dpi =
                sens.allSensitiviesAt1600dpi.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("1600 Dpi: " + Math.round(all1600dpi * 1000d) / 1000d);

    }
}
