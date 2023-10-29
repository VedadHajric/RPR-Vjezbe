package org.example;

import java.util.List;

public class MathUtils {
    public static Double min(List<Double> num) {
        double min = Double.MAX_VALUE;
        for(Double number : num) {
            if(number.doubleValue() < min) {
                min = number.doubleValue();
            }
        }
        return min;
    }
    public static Double max(List<Double> num) {
        double max = Double.MIN_VALUE;
        for(Double number : num) {
            if(number.doubleValue() > max) {
                max = number.doubleValue();
            }
        }
        return max;
    }
    public static Double mean(List<Double> num) {
        double sum = 0;
        for(Double number : num) {
            sum += number.doubleValue();
        }
        return sum/num.size();
    }
    public static Double stdev(List<Double> num) {
        Double mean = MathUtils.mean(num);
        float standardDeviation = 0;
        for(Double number : num) {
            standardDeviation += Math.pow(number - mean, 2);
        }
        return Math.sqrt(standardDeviation/num.size());
    }
}
