import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    private InsuranceCalculator insuranceCalculator = new InsuranceCalculator();

    @Test
    public void Test0(){
        double testValue = InsuranceCalculator.calculateInsurance(0);
        assertEquals(0,testValue);
    }
    @Test
    public void TestLessThan10000(){
        double testValue = InsuranceCalculator.calculateInsurance(10000);
        assertEquals(3650,testValue);
    }
    @Test
    public void TestLessthan30000(){
        double testValue = InsuranceCalculator.calculateInsurance(30000);
        assertEquals(39600,testValue);
    }
    @Test
    public void TestLessthan60000(){
        double testValue = InsuranceCalculator.calculateInsurance(60000);
        assertEquals(79500,testValue);
    }
    @Test
    public void TestMoreThan60000(){
        double testValue = InsuranceCalculator.calculateInsurance(90000);
        assertEquals(106200,testValue);
    }
}