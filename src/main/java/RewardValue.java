public class RewardValue {
    private double cash;
    private double rate = 0.0035;
    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.cash = miles * rate;
    }
    public double getCashValue() {
        return cash;
    }
    public double getMilesValue() {
        return this.cash / this.rate;
    }
}
