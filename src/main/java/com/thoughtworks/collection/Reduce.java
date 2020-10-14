package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        double average = arrayList.stream().reduce(0, (sum, current) -> (sum += current));
        return average / arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream().
                reduce(0, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream().
                reduce(0, (max, current) -> current % 2 !=0 ? current : max);
    }
}
