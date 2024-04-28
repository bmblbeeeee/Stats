package ru.netology.stats;

public class StatsService {

    public int sumOfSales(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum += num;
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int sum = sumOfSales(sales);
        return sum / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowerAverageSalesAmount(int[] sales) {
        int count = 0;
        int average = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int higherAverageSalesAmount(int[] sales) {
        int count = 0;
        int average = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

}


