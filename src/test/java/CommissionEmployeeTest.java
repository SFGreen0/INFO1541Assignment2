import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import EmployeeObjects.CommissionEmployee;


public class CommissionEmployeeTest {

    @Test
    public void testIncreaseSales() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.increaseSales(5000); //positive
        assertEquals(5000, emp.getSales());

        emp.increaseSales(-2000); //negative, shouldn't affect
        assertEquals(5000, emp.getSales());
    }

    @Test
    public void testHolidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        assertEquals(0, emp.holidayBonus());
    }

    @Test
    public void testAnnualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate(), 0.0001);
    }
}