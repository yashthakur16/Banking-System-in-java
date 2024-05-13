public class BankCustomer {
    private String customerName;
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;

    public BankCustomer(String customerName) {
        this.customerName = customerName;
        this.savingsAccount = new SavingsAccount();
        this.checkingAccount = new CheckingAccount();
    }

    public void addAccount(String accountType, BankAccount account) {
        if (accountType.equalsIgnoreCase("Savings")) {
            savingsAccount = (SavingsAccount) account;
        } else if (accountType.equalsIgnoreCase("Checking")) {
            checkingAccount = (CheckingAccount) account;
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void deposit(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("Savings")) {
            savingsAccount.deposit(amount);
        } else if (accountType.equalsIgnoreCase("Checking")) {
            checkingAccount.deposit(amount);
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void withdraw(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("Savings")) {
            savingsAccount.withdraw(amount);
        } else if (accountType.equalsIgnoreCase("Checking")) {
            checkingAccount.withdraw(amount);
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void checkBalance(String accountType) {
        if (accountType.equalsIgnoreCase("Savings")) {
            System.out.println("Balance of Savings Account: " + savingsAccount.getBalance());
        } else if (accountType.equalsIgnoreCase("Checking")) {
            System.out.println("Balance of Checking Account: " + checkingAccount.getBalance());
        } else {
            System.out.println("Invalid account type");
        }
    }
}
