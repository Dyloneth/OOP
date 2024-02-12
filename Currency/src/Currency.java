public abstract class Currency {
    protected double convertRateToCAD;

    public Currency(double convertRateToCAD) {
        this.convertRateToCAD = convertRateToCAD;
    }

    public abstract double convertToCAD(double amount);
    public abstract double convertFromCAD(double amount);
}