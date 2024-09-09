public class RewardValue {
    private double cash;
    private double miles;
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash * 0.0035;
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    public double getMilesValue() {
        return miles;
    }
    public void setMiles(double miles) {
        this.miles=miles;
    }
}
