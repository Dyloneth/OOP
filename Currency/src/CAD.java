public class CAD extends Currency {

    public CAD() {
        this.toCAD = 1.0;
        this.toUSD = 0.74;
        this.toEUR = 0.69;
        this.toGBP = 0.59;
    }

    @Override
    public double convert(Currency targetCurrency, double amount) {
        return amount / this.toCAD * targetCurrency.toCAD;
    }
}