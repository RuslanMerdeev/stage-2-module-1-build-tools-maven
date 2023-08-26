package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.startsWith("0")) {
            return false;
        }
        return NumberUtils.toDouble(str) > 0;
    }
}
