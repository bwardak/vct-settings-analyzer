package com.vct.settingsanalyzer.data;

public enum EmeaSensitivity {
    DERKE("fnatic", 296, "duelist"),
    ALFAJER("fnatic", 180, "sentinel"),
    LEO("fnatic", 164, "initiator"),
    BOASTER("fnatic", 208, "controller"),
    CHRONICLE("fnatic", 200, "initiator"),
    KEIKO("team liquid", 200, "duelist"),
    NATS("team liquid", 392, "sentinel"),
    ENZO("team liquid", 251.2, "initiator"),
    JAMPPI("team liquid", 253.6, "initiator"),
    MISTIC("team liquid", 192, "controller"),
    MARTEEN("karmine corp", 344, "duelist"),
    N4RRATE("karmine corp", 256, "initiator"),
    TOMASZY("karmine corp", 252, "controller"),
    MAGNUM("karmine corp", 181.6, "sentinel/initiator"),
    SHIN("karmine corp", 210, "controller"),
    ARDIIS("natus vincere", 216, "duelist"),
    SHAO("natus vincere", 240, "initiator"),
    SUYGETSU("natus vincere", 200, "sentinel"),
    ANGE1("natus vincere", 240, "controller"),
    ZYPPAN("natus vincere", 200, "initiator/duelist"),
    BENJYFISHY("team heretics", 226.4, "sentinel"),
    MINIBOO("team heretics", 232, "duelist"),
    BOO("team heretics", 300, "controller"),
    RIENS("team heretics", 216, "initiator"),
    WO0T("team heretics", 250, "initiator"),
    SAYF("vitality", 240, "sentinel"),
    RUNNER("vitality", 176, "duelist"),
    KICKS("vitality", 216, "initiator"),
    TREXX("vitality", 180.8, "initiator/controller"),
    CENDER("vitality", 140, "controller"),
    CLOUD("giantx", 280, "initiator"),
    FIT1NHO("giantx", 251.2, "duelist"),
    HOODY("giantx", 251.2, "sentinel"),
    REDGAR("giantx", 216, "controller"),
    PURP0("giantx", 280, "duelist"),
    BEYAZ("gentle mates", 195.2, "initiator"),
    LOGAN("gentle mates", 140, "sentinel"),
    NATANK("gentle mates", 320, ""),
    TAKAS("gentle mates", 192, "duelist"),
    WAILERS("gentle mates", 200, "controller"),
    BRAVE("bbl", 340, "controller"),
    ELITE("bbl", 256, "sentinel"),
    PAURA("bbl", 240, "initiator"),
    REAZY("bbl", 176, "initiator"),
    QUTIONERX("bbl", 171.2, "duelist"),
    MRFALIN("fut esports", 264, "initiator"),
    QRAXS("fut esports", 480, "initiator"),
    ATAKAPTAN("fut esports", 224, "controller"),
    YETUJEY("fut esports", 560, "sentinel"),
    CNED("fut esports", 240, "duelist");

    private final String teamName;
    private final double edpi;
    private final String role;  // new field for role

    EmeaSensitivity(String teamName, double edpi, String role) {
        this.teamName = teamName;
        this.edpi = edpi;
        this.role = role;
    }

    public String getTeamName() {
        return teamName;
    }

    public double getEdpi() {
        return edpi;
    }

    public String getRole() {
        return role;
    }
}
