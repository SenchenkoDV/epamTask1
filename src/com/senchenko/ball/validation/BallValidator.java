package com.senchenko.ball.validation;

import java.util.regex.Pattern;

public class BallValidator {
    private static final String CHECK_ON_NUMBER = "^(-?\\d+\\.?(\\d+)? -?\\d+\\.?(\\d+)? -?\\d+\\.?(\\d+)? (0*[1-9][0-9]*(\\.[0-9]+)?|0+\\.[0-9]*[1-9][0-9]*))$";
    public static boolean lineValidationCheck(String line) {
        boolean isNumbers = Pattern.matches(CHECK_ON_NUMBER, line);
        return isNumbers;
    }
}
