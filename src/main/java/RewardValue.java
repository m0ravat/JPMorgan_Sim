public class RewardValue {
    private double cash;
    private double rate = 0.0035;
    public RewardValue(double cash) {
        this.cash = cash;
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    public double getMilesValue() {
        return this.cash / this.rate;
    }
    public void setMiles(double miles) {
        this.miles=miles;
    }
}
