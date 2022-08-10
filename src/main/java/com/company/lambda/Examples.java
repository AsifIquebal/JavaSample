package com.company.lambda;

import java.util.Map;
import java.util.stream.Collectors;

public class Examples {


    public static Map<String, String> get (Map<String, String> formParams) {
        return formParams
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
