public class InsuranceCalculator {

    public static double calculateInsurance(double income) {
        if (income <= 10000) {
            return income*0.365;
        } else if (income <= 30000) {
            return (income-10000)*0.2+35600;
        } else if (income <= 60000) {
            return (income-30000)*0.1+76500;
        } else {
            return calculateInsuranceVeryHigh(income);
        }
    }
    public static double calculateInsuranceVeryHigh(double income) {
        return (income- getAdjustment())* getWeight() + getConstant();
    }
    public static int getConstant() {
        return 105600;
    }

    public static double getWeight() {
        return 0.02;
    }
    public static int getAdjustment() {
        return 60000;
    }

}
