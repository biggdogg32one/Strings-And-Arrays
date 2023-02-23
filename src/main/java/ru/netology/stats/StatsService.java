package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average(long[] sales) {
        long result = sum(sales);
        return result / sales.length;
    }

    public int maxSum(long[] sales) {
        int monthMax = 0;
        long maxSumSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maxSumSale) {
                maxSumSale = sales[i];
                monthMax = i;

            }

        }
        return monthMax + 1;
    }

    public int minSum(long[] sales) {
        int monthMin = 0;
        long minSumSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minSumSale) {
                minSumSale = sales[i];
                monthMin = i;
            }

        }
        return monthMin + 1;
    }

    public int belowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;

            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;

            }
        }
        return counter;


    }
}
