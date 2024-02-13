public class USD extends Currency {

    public USD() {
        this.toCAD = 1.35;
        this.toUSD = 1.0;
        this.toEUR = 0.93;
        this.toGBP = 0.79;
    }

    @Override
    public double convert(Currency targetCurrency, double amount) {
        return amount / this.toCAD * targetCurrency.toCAD;
    }
}