package ru.netology.stats;

public class StatsService<month> {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long findAverage(long[] purchases) {
        long total = 0;
        long average = 0;
        for (long x = 0; x < purchases.length; ++x)
            total += purchases[(int) x];
        {
            average = total / purchases.length;
        }
        return average;
    }

    public long findMax(long[] purchases) {
        long month = 0;
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax <= purchase) {
                currentMax = purchase;
                month = month + 1;
            }
        }
        return month;
    }

    public long findMin(long[] purchases) {
        long month = 0;
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin >= purchase) {
                currentMin = purchase;
                month = month + 1;
            }
        }
        return month;
    }

    public long findAverageMin(long[] purchases) {
        long month = 0;
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin >= purchase) {
                currentMin = purchase;
                month = month + 1;
            }
        }
        return month;
    }

    public long findAverageMax(long[] purchases) {
        long month = 0;
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin >= purchase) {
                currentMin = purchase;
                month = month + 1;
            }
        }
        return month;
    }
}
