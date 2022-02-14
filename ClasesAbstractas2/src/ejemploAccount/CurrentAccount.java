package ejemploAccount;

public class CurrentAccount extends Account {
    private static int cont;
    private int idTrans;
    double paid;

    public CurrentAccount(String name, double number, double balance, double interest) {
        super(name, number, balance, interest);
        cont++;
        idTrans = cont;
    }


    public int getId() {
        return idTrans;
    }


    public void transactionReceipt(){
        cont++;
    }

    @Override
    public double calculateInterest() {
        if(getBalance()>=1500000){
            paid = getBalance() * 0.05;
        }else{
            paid = getBalance() * 0.01;
        }
        return paid;
    }

    @Override
    public double getFinalBalance() {
        return getBalance() - paid ;
    }


}
