public class CheckingAccount extends Account {

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public double calculateServiceFee() {
        return 50;
    }
}