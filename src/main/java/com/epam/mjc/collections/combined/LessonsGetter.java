package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {

        Set<String> result = new TreeSet<>();

        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            result.addAll(entry.getValue());
        }
        return  result;
       }
    }

