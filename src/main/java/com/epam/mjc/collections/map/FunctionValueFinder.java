package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean result = false;
        for(Map.Entry<Integer, Integer> value : functionMap.entrySet()){
            if (value.getValue() == requiredValue){
                result = true;
            }
        }
        return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element: sourceList){
            map.put(element,(5*element+2));
        }
        return map;
    }
}
