package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> result = new HashMap<>();


        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Set<String> setString = new HashSet<>();
            String currentString = entry.getKey();
            Integer newKey = currentString.length();

            if (result.containsKey(newKey)) {
                setString.addAll(result.get(newKey));
                setString.add(currentString);
            } else {
                setString.add(currentString);
            }
            result.put(newKey, setString);
        }
        return result;
    }
}
