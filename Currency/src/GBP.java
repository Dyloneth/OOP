public class GBP extends Currency {

    public GBP() {
        this.toCAD = 1.70;
        this.toUSD = 1.26;
        this.toEUR = 1.17;
        this.toGBP = 1.0;
    }

    @Override
    public double convert(Currency targetCurrency, double amount) {
        return amount / this.toCAD * targetCurrency.toCAD;
    }
}