public class USD extends Currency{
    public USD(double convertRateToCAD) {
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