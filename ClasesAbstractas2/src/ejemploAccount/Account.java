package ejemploAccount;

public abstract class Account {
    private String name;
    private double number;
    private double balance;
    private double interest;

    public Account(String name, double number, double balance, double interest) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.interest = interest;
    }

    public abstract double calculateInterest();
    public abstract double getFinalBalance();

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }




}
