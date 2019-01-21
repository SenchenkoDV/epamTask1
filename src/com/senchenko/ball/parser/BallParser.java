package com.senchenko.ball.parser;

import com.senchenko.ball.validation.Validator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallParser {
    private static final String SPLITTER = "\\s";
    private static List<List<String>> dateForObjects = new ArrayList<>();

    public static List<List<String>> parseValidDateForEntity(List<String> inputData, Validator validator){
        for (String element    :  inputData) {
            if (validator.lineValidationCheck(element)){
                dateForObjects.add(new ArrayList<>(Arrays.asList(element.split(SPLITTER))));
            }
        }
        return dateForObjects;
    }
}
