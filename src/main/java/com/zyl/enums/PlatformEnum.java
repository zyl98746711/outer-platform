package com.zyl.enums;

import lombok.Getter;

/**
 * 平台枚举
 *
 * @author zyl
 */
@Getter
public enum PlatformEnum {

    A(1, "A平台"),

    B(2, "B平台");

    private final Integer value;

    private final String text;

    PlatformEnum(Integer value, String text) {
        this.value = value;
        this.text = text;
    }
}
