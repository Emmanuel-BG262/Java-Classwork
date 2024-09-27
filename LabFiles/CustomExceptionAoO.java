package Labwork;
import java.util.*;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accNo;
    private String accType;
    private String accHolder;
    private long balance;

    public BankAccount(int accNo, String accType, String accHolder, long balance) {
        this.accNo = accNo;
        this.accType = accType;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void deposit(long amt) throws InvalidAmountException {
        if (amt <= 0) {
            throw new InvalidAmountException("Invalid amount; must be greater than 0.");
        }
        balance += amt;
        System.out.println("Deposit successful! New balance: " + balance);
    }

    public void withdraw(long amt) throws InvalidAmountException, InsufficientFundsException {
        if (amt <= 0) {
            throw new InvalidAmountException("Invalid amount; must be greater than 0.");
        }
        if (amt > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        balance -= amt;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    public void displayDetails() {
        System.out.println("Name of Account Holder: " + accHolder);
        System.out.println("Account No.: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }
}

public class CustomException {
    static final int MAX_ACCOUNTS = 10;
    static BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    static int numAccounts = 0;

    public static BankAccount findAccount(int accNo) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccNo() == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** Banking System Application ***");
            System.out.println("1. Open New Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (numAccounts < MAX_ACCOUNTS) {
                        System.out.print("Enter Account No: ");
                        int no = sc.nextInt();
                        System.out.print("Enter Account Type: ");
                        String type = sc.next();
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter Initial Balance: ");
                        long bal = sc.nextLong();
                        accounts[numAccounts++] = new BankAccount(no, type, name, bal);
                        System.out.println("Account created successfully!");
                    } else {
                        System.out.println("Maximum number of accounts reached.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();
                    BankAccount acc = findAccount(accNo);
                    if (acc != null) {
                        acc.displayDetails();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    acc = findAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter amount to deposit: ");
                        long depAmt = sc.nextLong();
                        try {
                            acc.deposit(depAmt);
                        } catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    acc = findAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        long withAmt = sc.nextLong();
                        try {
                            acc.withdraw(withAmt);
                        } catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        } catch (InsufficientFundsException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    acc = findAccount(accNo);
                    if (acc != null) {
                        acc.displayDetails();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the banking system. See you soon!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
