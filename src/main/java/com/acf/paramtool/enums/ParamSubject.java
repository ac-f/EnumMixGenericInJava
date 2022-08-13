package com.acf.paramtool.enums;

import com.acf.paramtool.interfaces.Param;

import java.util.List;

public enum ParamSubject implements Param {
    NOT_DEFINED(-1, List.of("未定義")),
    PEOPLE_AND_GROUP(1, List.of("人物與團體")),
    ART_AND_HUMANITY(2, List.of("藝術與人文")),
    SOCIAL_AND_POLITIC(3, List.of("社會與政治")),
    CULTURE_AND_RELIGION(4, List.of("民俗與宗教")),
    INDUSTRY_AND_ECONOMIC(5, List.of("產業與經濟")),
    SPACE_AND_GEOGRAPHY(6, List.of("空間、地域與遷徙")),
    ETHNIC_AND_LANGUAGE(7, List.of("族群與語言")),
    BIOGRAPHY_AND_ECOLOGY_AND_ENVIRONMENT(8, List.of("生物、生態與環境")),
    OTHER(9, List.of("其他"));


    private final int value;
    private final List<String> matchName;
    ParamSubject(int value, List<String> matchName) {
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
