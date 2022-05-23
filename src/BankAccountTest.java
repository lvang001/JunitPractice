import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class BankAccountTest {

    @Test
    //test one
    public void testGetName() throws Exception {
        BankAccount luckyAccount = new BankAccount(1000.00, "Lucky", 10001);

        String expectedName = "Lucky";

        assertEquals((String)expectedName,(String) luckyAccount.getName());
    }

    @Test
    //test two
    public void testGetBalance() {
        BankAccount bill = new BankAccount(1000.00, "Bill", 1002);

        Double expectedAmount = 1000.00;
        
        assertEquals((Double)expectedAmount,(Double) bill.getBalance());
    }

    @Test 
    //test three
    public void testGetId() {
        BankAccount villn = new BankAccount(1000.00, "Villn", 1005);

        int expectedId = 1005;

        assertEquals((Integer)expectedId,(Integer)villn.getAcctNum());
    }

    @Test
    //test four

    public void testBankAccount() {
        BankAccount twig = new BankAccount(1000.00, "Twig", 10065);

        int expectedId = 10065;
        String expectedName = "Twig";
        Double expectedAmount = 1000.00;

        assertEquals((Integer)expectedId,(Integer)twig.getAcctNum());
        assertEquals((String)expectedName,(String)twig.getName());
        assertEquals((Double)expectedAmount,(Double)twig.getBalance());
    }

    @Test
    //test five

    public void testDeposit() {
        BankAccount twig = new BankAccount(1000.00, "Twig", 10065);

        Double expectedAmount = 1050.00;
        twig.Deposit(50);

        assertEquals((Double)expectedAmount,(Double)twig.getBalance());
    }

    @Test
    //test six
    public void testWithdraw() {
        BankAccount twig = new BankAccount(1000.00, "Twig", 10065);
        twig.Withdraw(50);

        Double expectedAmount = 950.00;

        assertEquals((Double)expectedAmount,(Double)twig.getBalance());
    }

    @Test
    //test seven
    public void testSetName () {
        BankAccount twig = new BankAccount(100.00, "Twig", 10065);

        twig.setName("Lucky");

        String expectedName = "Lucky";

        assertEquals((String)expectedName,(String)twig.getName());

    }

    @Test
    //test eight
    public void testSetId () {
        BankAccount twig = new BankAccount(100.00, "Twig", 10065);

        twig.setAcctNum(100848);

        int expectedId = 100848;

        assertEquals((Integer)expectedId,(Integer)twig.getAcctNum());
    }

    @Test
    //test nine
    public void testSetBalance() {
        BankAccount twig = new BankAccount(100.00, "Twig", 10065);

        twig.setBalance(100454.00);

        Double expectedAmount = 100454.00;

        assertEquals((Double)expectedAmount,(Double)twig.getBalance());
    }

    @Test
    //test test
    public void testGetIdName() {
        BankAccount twig = new BankAccount(100.00, "Twig", 10065);

        twig.setAcctNum(89998);

        int expectedId = 89998;

        assertEquals((Integer)expectedId,(Integer)twig.getAcctNum());
    }
}
