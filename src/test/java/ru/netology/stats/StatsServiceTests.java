package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {

    @Test
    public void findSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMonthOfHighestSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMonthOfLowestSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAmountOfMonthsSalesLowerAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.lowerAverageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAmountOfMonthsSalesHigherAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.higherAverageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

}
