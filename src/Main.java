import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кредитный калькулятор рассчитывающий ежемесячный платеж на 12, 24 и 36 месяцев по привлекательной ставке - 9.99%");
        int[] months = {12, 24, 36};
        System.out.print("Введите сумму, которую хотели бы взять ... например 1 000 000: ");
        int amount = sc.nextInt();
        double percent = 9.99;

        for (int month : months) {
            System.out.print("Ваш ежемесячный платеж при условиях: " + month + " месяца(ев), сумме кредита - " + amount + " равен ");
            System.out.print(CreditPaymentService.calculate(month, amount, percent) + " руб.\n");
        }
    }
}
