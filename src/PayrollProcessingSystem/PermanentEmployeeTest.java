package PayrollProcessingSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermanentEmployeeTest {

    private PermanentEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new PermanentEmployee("Arun", 3000, 101, 500, 200);}

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(3700, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(370, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(3330, employee.calculateNetSalary());
    }
}