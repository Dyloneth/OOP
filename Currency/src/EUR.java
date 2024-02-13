public class EUR extends Currency {

    public EUR() {
        this.toCAD = 1.45;
        this.toUSD = 1.08;
        this.toEUR = 1.0;
        this.toGBP = 0.85;
    }

    @Override
    public double convert(Currency targetCurrency, double amount) {
        return amount * this.toCAD / targetCurrency.toCAD;
    }
}