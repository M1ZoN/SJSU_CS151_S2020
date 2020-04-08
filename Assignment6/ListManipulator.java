package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ListManipulator {

    ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
        if (ascending)
            Collections.sort(myLst);
        else
            Collections.sort(myLst, Collections.reverseOrder());
        return myLst;
    }

    ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        int small = 0;
        int large = 0;

        for (int i = 0; i < myLst.size(); i++) {
            if (myLst.get(i) < myLst.get(small))
                small = i;
        }
        for (int i = myLst.size() - 1; i >= 0; i--) {
            if (myLst.get(i) > myLst.get(large))
                large = i;
        }
        Collections.swap(myLst, small, large);
        return (myLst);
    }

    void table(ArrayList<Integer> myLst) {
        Map<Integer, Integer>res = new HashMap<>();

        for (int i = 0; i < myLst.size(); i++) {
            if (res.containsKey(myLst.get(i)))
                res.put(myLst.get(i), res.get(i) + 1);
            else
                res.put(myLst.get(i), 1);
        }

        for (Map.Entry<Integer, Integer>entry : res.entrySet()) {
            System.out.println("Integer: " + entry.getKey() + " Occurrence: " + entry.getValue());
        }
    }
}
