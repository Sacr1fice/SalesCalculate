package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int totalSum(int[] stats) {
        int sum = Arrays.stream(stats).sum();
        return sum;
    }

    public int getAvgSum(int[] stats) {
        int avgSum = totalSum(stats) / 12;
        return avgSum;
    }

    public int maxSales(int[] stats) {
        int maxMonth = 0;

        for (int i = 0; i < stats.length; i++) {
            if (stats[i] >= stats[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] stats) {
        int minMonth = 0;

        for (int i = 0; i < stats.length; i++) {
            if (stats[i] <= stats[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getMonthBelowAvgSales(int[] stats) {
        int avgSum = getAvgSum(stats);
        int monthBelowAvgSales = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] < avgSum) {
                monthBelowAvgSales++;
            }
        }
        return monthBelowAvgSales;
    }

    public int getMonthAboveAvgSales(int[] stats) {
        int avgSum = getAvgSum(stats);
        int monthAboveAvgSales = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > avgSum) {
                monthAboveAvgSales++;
            }
        }
        return monthAboveAvgSales;
    }
}

