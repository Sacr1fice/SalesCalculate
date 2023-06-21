package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumExact() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.totalSum(stats);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldAvgSumExact() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.getAvgSum(stats);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldMaxSalesMonthCalculateExact() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.maxSales(stats);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test
    public void shouldMinSalesMonthCalculateExact() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(stats);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test
    public void shouldMonthsBelowAvgSumCalculateExact() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.getMonthBelowAvgSales(stats);

        Assertions.assertEquals(expectedMonths, actualMonths);

    }

    @Test
    public void shouldMonthsAboveAvgSumCalculateExact() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.getMonthBelowAvgSales(stats);

        Assertions.assertEquals(expectedMonths, actualMonths);

    }
}
