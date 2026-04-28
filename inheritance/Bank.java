class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
        System.out.println("Bank constructor");
    }

    void showBank() {
        System.out.println("Bank: " + bankName);
    }
}

class SavingsAccount extends Bank {
    double balance;

    SavingsAccount(String bankName, double balance) {
        super(bankName);
        this.balance = balance;
        System.out.println("SavingsAccount constructor");
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class PremiumSavings extends SavingsAccount {
    double interestRate;

    PremiumSavings(String bankName, double balance, double interestRate) {
        super(bankName, balance);
        this.interestRate = interestRate;
        System.out.println("PremiumSavings constructor");
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: " + interest);
    }
}

class BankRunner {
    public static void main(String[] args) {
        PremiumSavings acc = new PremiumSavings("SBI", 50000, 5.5);

        acc.showBank();
        acc.showBalance();
        acc.calculateInterest();
    }
}