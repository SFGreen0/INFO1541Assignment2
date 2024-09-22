import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import EmployeeObjects.SalaryEmployee;


public class SalaryEmployeeTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        assertEquals(1237.02, emp.calculateWeeklyPay(), 0.01);
    }

    @Test
    public void testHolidayBonus() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        assertEquals(2164.54, emp.holidayBonus(), 0.01);
    }
}