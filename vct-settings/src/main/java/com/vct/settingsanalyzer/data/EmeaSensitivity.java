package com.vct.settingsanalyzer.data;

public enum EmeaSensitivity {
    DERKE("fnatic", 296),
    ALFAJER("fnatic", 180),
    LEO("fnatic", 164),
    BOASTER("fnatic", 208),
    CHRONICLE("fnatic", 200),
    KEIKO("team liquid", 200),
    NATS("team liquid", 392),
    ENZO("team liquid", 251.2),
    JAMPPI("team liquid", 253.6),
    MISTIC("team liquid", 192),
    MARTEEN("karmine corp", 344),
    N4RRATE("karmine corp", 256),
    TOMASZY("karmine corp", 252),
    MAGNUM("karmine corp", 181.6),
    SHIN("karmine corp", 210),
    ARDIIS("natus vincere", 216),
    SHAO("natus vincere", 240),
    SUYGETSU("natus vincere", 200),
    ANGE1("natus vincere", 240),
    ZYPPAN("natus vincere", 200),
    BENJYFISHY("team heretics", 226.4),
    MINIBOO("team heretics", 232),
    BOO("team heretics", 300),
    RIENS("team heretics", 216),
    WO0T("team heretics", 250),
    SAYF("vitality", 240),
    RUNNER("vitality", 176),
    KICKS("vitality", 216),
    TREXX("vitality", 180.8),
    CENDER("vitality", 140),
    CLOUD("giantx", 280),
    FIT1NHO("giantx", 251.2),
    HOODY("giantx", 251.2),
    REDGAR("giantx", 216),
    PURP0("giantx", 280),
    BEYAZ("gentle mates", 195.2),
    LOGAN("gentle mates", 140),
    NATANK("gentle mates", 320),
    TAKAS("gentle mates", 192),
    WAILERS("gentle mates", 200),
    BRAVE("bbl", 340),
    ELITE("bbl", 256),
    PAURA("bbl", 240),
    REAZY("bbl", 176),
    QUTIONERX("bbl", 171.2),
    MRFALIN("fut esports", 264),
    QRAXS("fut esports", 480),
    ATAKAPTAN("fut esports", 224),
    YETUJEY("fut esports", 560),
    CNED("fut esports", 240)
    ;


    private final String teamName;
    private final double edpi;

    EmeaSensitivity(String teamName, double edpi) {
        this.teamName = teamName;
        this.edpi = edpi;
    }

    public String getTeamName() {
        return teamName;
    }

    public double getEdpi() {
        return edpi;
    }
}
