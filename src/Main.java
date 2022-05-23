

public class Main {
    public static void main(String[] args) throws Exception {

        

        BankAccount Lucky = new BankAccount(500.00, "Lucky");
        Lucky.Deposit(100.00);

        BankAccount Twig = new BankAccount(5000.00, "Twig");
        BankAccount Bill = new BankAccount(300.00, "Bill");
        Twig.Withdraw(100);
        Bill.Deposit(100);

        Lucky.Account();
        Twig.Account();
        Bill.Account();

        Product orange = new Product(3.99, 2, "Orange");

        orange.show();
        orange.totalCost();
    }
}
