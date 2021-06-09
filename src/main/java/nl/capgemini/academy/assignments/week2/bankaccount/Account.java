package nl.capgemini.academy.assignments.week2.bankaccount;

public class Account {
    private String accountHolder;
    private int balance;
    private String bankName;
    private String iban;

    public Account(String accountHolder, int balance, String bankName, String iban) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.bankName = bankName;
        this.iban = iban;
    }

    public void deposit(int amount) {
        int newBalance = balance + amount;
        System.out.format("%s Deposit: old balance %d -> new balance %d%n", accountHolder, balance, newBalance);
        this.balance = newBalance;
    }

    public void withdraw(int amount) {
        int newBalance = balance - amount;
        System.out.format("%s Withdraw: old balance %d -> new balance %d%n", accountHolder, balance, newBalance);
        this.balance = newBalance;
    }

    public void transferTo(Account account, int amount) {
        withdraw(amount);
        account.deposit(amount);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
