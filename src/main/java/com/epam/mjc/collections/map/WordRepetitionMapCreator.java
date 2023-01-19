package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> map = new HashMap<>();
        String result = sentence.toLowerCase()
                .replaceAll(",", "")
                .replaceAll("\\.", "");
        String[] words = result.split(" ");
        if(sentence.isEmpty()){
            return map;
        } else {
        for (String word : words){
            map.merge(word, 1, Integer::sum);
        }}
        return map;
    }
}
