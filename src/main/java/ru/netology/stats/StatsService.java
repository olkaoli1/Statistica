package ru.netology.stats;

public class StatsService {

    // Метод для расчета суммы всех продаж
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Метод для расчета средней суммы продаж в месяц
    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    // Метод для поиска месяца с максимальными продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // +1 для преобразования индекса в номер месяца
    }

    // Метод для поиска месяца с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // +1 для преобразования индекса в номер месяца
    }

    // Метод для подсчета количества месяцев с продажами ниже среднего
    public int belowAverageMonths(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета количества месяцев с продажами выше среднего
    public int aboveAverageMonths(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}

