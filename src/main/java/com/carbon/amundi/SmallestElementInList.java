package com.carbon.amundi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestElementInList {

   /* Find the smallest element in a list
    Example :
    Input = {“a”,”b”,”c”} => Output = “a”
    Input = {1,2,3} => Output = 1*/

    public static <T extends Comparable<T>> T findSmallestElement(List<T> list) {
        List<T> copy = new ArrayList<>(list);
        Collections.sort(copy);
        return copy.getFirst();
    }

}