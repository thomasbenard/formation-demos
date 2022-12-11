package fr.arolla.formationdemos.unittest1.pourquoitester;

import java.util.List;

public class AverageCalculator {

    public static double calculate(List<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }
}
