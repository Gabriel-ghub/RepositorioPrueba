package ejemploAccount;

public class Saving_Account extends Account{
    private double maintenanceFee;

    public Saving_Account(String name, double number, double balance, double interest, double maintanceFee) {
        super(name, number, balance, interest);
        this.maintenanceFee = maintanceFee;
    }

    @Override
    public double calculateInterest() {
        return getBalance()*getInterest();
    }

    @Override
    public double getFinalBalance() {
        return getBalance() - maintenanceFee;
    }
}
