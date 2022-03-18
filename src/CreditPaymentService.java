public class CreditPaymentService {
    public static int calculate(int creditPeriodMonth, int amount, double yearPercent) {

        // Рассчитаем процентную ставку в месяц (по году)
        double monthPercent = yearPercent / (100 * 12);

        double x = 1 + monthPercent;
        double y = -(creditPeriodMonth); // -   СРОК КРЕДИТА

        // Ежемесячный платеж .. по формуле
        return (int) (amount * (monthPercent / (1 - Math.pow(x, y))));
    }
}
