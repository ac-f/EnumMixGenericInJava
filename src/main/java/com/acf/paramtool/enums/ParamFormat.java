package com.acf.paramtool.enums;

import com.acf.paramtool.interfaces.Param;

import java.util.List;

public enum ParamFormat implements Param {
    NOT_DEFINED(-1, List.of("未定義")),
    IMAGE(1, List.of("圖片", "圖像")),
    VIDEO(2, List.of("影片", "影像")),
    SOUND(3, List.of("聲音", "音頻")),
    DOCUMENT(4, List.of("文件", "文檔")),
    OTHERS(5, List.of("其他"));


    private final int value;
    private final List<String> matchName;
    ParamFormat(int value, List<String> matchName) {
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
