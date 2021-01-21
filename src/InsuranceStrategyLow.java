public class InsuranceStrategyLow extends InsuranceStrategy {
    public double calculateInsuranceVeryHigh(double income){
        return income * .365;
    }

    @Override
    public int getConstant() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public int getAdjustment() {
        return 0;
    }

}
