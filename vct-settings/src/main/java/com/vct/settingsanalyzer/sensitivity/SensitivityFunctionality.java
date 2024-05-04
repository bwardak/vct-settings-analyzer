package com.vct.settingsanalyzer.sensitivity;

public interface SensitivityFunctionality {
    void averageSensitivity();
    void averageLowSensitivity();
    void averageMediumSensitivity();
    void averageHighSensitivity();

    void groupLowSensitivity();
    void groupMediumSensitivity();
    void groupHighSensitivity();

    void convertEdpiToSens();

}
