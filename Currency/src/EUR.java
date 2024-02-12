public class EUR extends Currency{
    public EUR(double convertRateToCAD) {
        super(convertRateToCAD);
    }

    @Override
    public double convertToCAD(double amount) {
        return amount * convertRateToCAD;
    }

    @Override
    public double convertFromCAD(double amount) {
        return amount / convertRateToCAD;
    }
}