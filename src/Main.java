public class Main {
    public static void main(String[] args) {


        int cashBack;
        int cashDeposit;
        int account;
        int moneyBill;

        account = 1000;
        cashDeposit = 232;

        moneyBill = account + cashDeposit;

        if (cashDeposit >= 1000) {
            cashBack = cashDeposit / 100;
        } else {
            cashBack = 0;
        }

        if (cashBack >= 1) {
            System.out.println((moneyBill + cashBack) + " баланс вашего счета");
        } else {
            System.out.println((moneyBill) + " баланс вашего счета");
        }
    }
}