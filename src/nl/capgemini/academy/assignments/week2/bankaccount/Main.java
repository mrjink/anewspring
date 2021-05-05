package nl.capgemini.academy.assignments.week2.bankaccount;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Jan", 2000, "bank 1", "iban 1");
        Account account2 = new Account("Piet", 5000, "bank 2", "iban 2");
        Account account3 = new Account("Joris", 10000, "bank 3", "iban 3");

        account1.deposit(1000);
        account2.withdraw(3000);
        account3.withdraw(15000);
        account1.deposit(1500);
        account1.withdraw(100);
        account3.deposit(5500);
        account2.withdraw(142);

        // BONUS
        account2.transferTo(account3, 500);
        account1.transferTo(account2, 400);
    }
}
