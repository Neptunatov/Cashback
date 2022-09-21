public class Main {
    public static void main(String[] args) {

        int cashback;
        int cash;
        cash= 988;
        if (cash >=1000) {
            cashback=cash/100;
            System.out.println((cash+cashback)+ "баланс вашего счета");
        } else {
            System.out.println((cash)+"Баланс вашего счета");
        }
        

    }
}