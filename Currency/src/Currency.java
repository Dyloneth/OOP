public abstract class Currency {

    protected double toUSD;
    protected double toEUR;
    protected double toGBP;
    protected double toCAD;

    public abstract double convert(Currency targetCurrency, double amount);
}