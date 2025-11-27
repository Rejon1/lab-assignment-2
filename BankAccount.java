package Lab_Assignment2.Encapsulation;

class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class Main6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber("SB-09876");
        account.setBalance(2000.0);

        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
