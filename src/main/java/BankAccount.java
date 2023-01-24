public class BankAccount {


    //Create a BankAccount class which has a firstName, lastName, dateOfBirth,
    // accountNumber and balance (which should start at 0).
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String accountNumber;
    private double balance;

    public BankAccount(String firstName,
                       String lastName,
                       String dateOfBirth,
                       String accountNumber,
                       double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    //Write and test getters and setters for all these properties.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }


    // Create a method called deposit() that takes in an amount updates the balance of the BankAccount.
    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds, withdrawal unsuccessful.");
        } else {
            balance -= amount;
        }
        return amount;
    }
    public void payInterest(double rate){
        balance += balance * rate;
    }

}
