public class CAD extends Currency{
    public CAD(double convertRateToCAD) {
        super(convertRateToCAD);
    }

    @Override
    public double convertToCAD(double amount) {
        return amount;
    }

    @Override
    public double convertFromCAD(double amount) {
        return amount;
    }
}
