public class InvestmentAccount extends Account {

    public InvestmentAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public double calculateServiceFee() {
        return getBalance() * 0.02;
    }
}