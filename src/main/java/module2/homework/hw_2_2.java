
package module2.homework;

public class hw_2_2 {

    public static void main(String[] args) {

        double balance = 1000.25;
        double cash = 1000.05;

        getCash(balance, cash);
    }


    static void getCash(double balance, double sum) {

        double commissions = sum * 0.05;

        if (sum + commissions < balance) {
            System.out.println("Успешно! Операция на сумму " + (sum + commissions) + " грн. Остаток: " + (balance - (sum + commissions)));
        } else {
            System.out.println("Операция отклонена, не достаточный баланс!");
        }

    }
}
