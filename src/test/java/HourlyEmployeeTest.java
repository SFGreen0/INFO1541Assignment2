import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import EmployeeObjects.HourlyEmployee;


public class HourlyEmployeeTest {

    @Test
    public void testIncreaseHours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(5); //positive
        assertEquals(5, emp.getHoursWorked());

        emp.increaseHours(-3); //negative
        assertEquals(5, emp.getHoursWorked()); //value unchanged
    }

    @Test
    public void testAnnualRaise() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();
        assertEquals(34.49, emp.getWage(), 0.01);
    }

    @Test
    public void testCalculateWeeklyPay() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay(), 0.01);

        emp.increaseHours(45);
        assertEquals(1560.38, emp.calculateWeeklyPay(), 0.01);
    }
}