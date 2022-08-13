package com.acf.paramtool.enums;

import com.acf.paramtool.interfaces.Param;

import java.util.List;

public enum ParamSource implements Param {
    NOT_DEFINED(-1, List.of("未定義")),
    IMAGE(1, List.of("收存系統")),
    MOC_COLLECTIONS(2, List.of("文化部典藏網")),
    Comm_New_Story(3, List.of("臺灣故事島")),
    BOCH(4, List.of("國家文化資產網")),
    ONLINE_METADATA(5, List.of("國家文化資料庫")),
    DRNH_MOCREDIS(6, List.of("國史館")),
    CultureMemory_FC(7, List.of("臺灣文獻館文獻檔案")),
    NPM(8, List.of("國立故宮博物院")),
    NTU(9, List.of("國立臺灣大學")),
    ARCHIVES(10, List.of("國家檔案資訊網")),
    LIMEISHU(11, List.of("李梅樹紀念館")),
    TAIFUTEN(12, List.of("陳澄波文化基金會")),
    PCCU(13, List.of("中國文化大學")),
    THMCENTER(14, List.of("吳三連台灣史料基金會"));


    private final int value;
    private final List<String> matchName;
    ParamSource(int value, List<String> matchName) {
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
