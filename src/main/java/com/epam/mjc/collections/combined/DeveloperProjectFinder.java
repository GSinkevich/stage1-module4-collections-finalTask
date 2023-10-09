package com.epam.mjc.collections.combined;

import java.util.*;


public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        Comparator <String> myComparator = new LengthStringComparator().thenComparing(new AlphabetReversComparator());

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            Set<String> c = entry.getValue();
            if (c.contains(developer)) {
                result.add(entry.getKey());
            }
        }
        result.sort(myComparator);

        return result;

    }
}

class LengthStringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

class AlphabetReversComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}


