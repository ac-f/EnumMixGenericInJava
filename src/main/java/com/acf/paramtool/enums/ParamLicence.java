package com.acf.paramtool.enums;

import com.acf.paramtool.interfaces.Param;

import java.util.List;

public enum ParamLicence implements Param {
    NOT_DEFINED(-1, List.of("未定義")),
    PDM(1, List.of("PDM")),
    CC0(2, List.of("CC0")),
    OGDL(3, List.of("OGDL")),
    CC_BY(4, List.of("CC BY")),
    CC_BY_SA(5, List.of("CC BY-SA")),
    CC_BY_NC(6, List.of("CC BY-NC")),
    CC_BY_NC_SA(7, List.of("CC BY-NC-SA")),
    CC_BY_ND(8, List.of("CC BY-ND")),
    CC_BY_NC_ND(9, List.of("CC BY-NC-ND")),
    PUBLIC_ONLY(10, List.of("僅限公開瀏覽"));


    private final int value;
    private final List<String> matchName;
    ParamLicence(int value, List<String> matchName) {
        this.value = value;
        this.matchName = matchName;
    }

    public List<String> getMatchName() {
        return matchName;
    }

    public int getValue () {
        return value;
    }
}
