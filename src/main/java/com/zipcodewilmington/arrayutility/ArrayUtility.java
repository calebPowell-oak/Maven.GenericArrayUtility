package com.zipcodewilmington.arrayutility;

import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {

    List<T> contents = new ArrayList<T>();

    public ArrayUtility(T[] array){
        contents.addAll(Arrays.asList(array));
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Integer count = 0;
        contents.addAll(Arrays.asList(arrayToMerge));
        for(T value : contents){
            if(value.equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        contents.addAll(Arrays.asList(arrayToMerge));
        T highest = contents.get(0);
        Integer count = 1;
        Map<T, Integer> map = new LinkedHashMap<>();
        for(T value : contents){
            if(map.containsKey(value)){
                map.replace(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
            if(map.get(value) > count){
                highest = value;
                count = map.get(value);
            }
        }
        return highest;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer numberOfOccurances = 0;
        for(T value : contents){
            
        }
        return numberOfOccurances;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }
}
