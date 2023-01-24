import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class testBankAccount {
    @Test
    public void testGettersAndSetter(){
        BankAccount bankAccount = new BankAccount("A","B",
                "C",
                "D",
        0.0);
        bankAccount.setFirstName("William");
        bankAccount.setLastName("Shakespeare");
        bankAccount.setDateOfBirth("26 April");
        bankAccount.setAccountNumber("123456");
        bankAccount.setBalance(100.0);

        assertThat(bankAccount.getFirstName()).isEqualTo("William");
        assertThat(bankAccount.getLastName() ).isEqualTo("Shakespeare") ;
        assertThat(bankAccount.getDateOfBirth() ).isEqualTo("26 April") ;
        assertThat(bankAccount.getAccountNumber() ).isEqualTo("123456") ;
        assertThat(bankAccount.getBalance() ).isEqualTo(100.0) ;

    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("A",
                "B",
                "C",
                "D",0.0);
        account.deposit(50.0);
        assertThat(account.getBalance()).isEqualTo(50.0);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("A",
                "B",
                "C",
                "D",
                0);
        account.deposit(100.0);
        account.withdrawal(50.0);
        assertThat(account.getBalance()).isEqualTo(50.0);
    }

    @Test
    public void testPayInterest() {
        BankAccount account = new BankAccount("A",
                "B",
                "C",
                "D",
                0);
        account.deposit(100.0);
        account.payInterest(0.05);


    }

}
