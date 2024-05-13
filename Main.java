import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Banking System");
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        BankCustomer customer = new BankCustomer(customerName);
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        customer.addAccount("Savings", savingsAccount);
        customer.addAccount("Checking", checkingAccount);

        boolean on = true;

        while (on) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account type (Savings/Checking): ");
                    String accountType = scanner.next();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    customer.deposit(accountType, depositAmount);
                    break;
                case 2:
                    System.out.print("Enter account type (Savings/Checking): ");
                    accountType = scanner.next();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    customer.withdraw(accountType, withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter account type (Savings/Checking): ");
                    accountType = scanner.next();
                    customer.checkBalance(accountType);
                    break;
                case 4:
                    on = false;
                    System.out.println("Thank you for using our Banking System");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}
