public class SavingAccount extends Account {

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public double calculateServiceFee() {
        if (getBalance() > 10000) {
            return 0;
        } else {
            return 10;
        }
    }
}