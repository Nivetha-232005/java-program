package PayrollProcessingSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContractEmployeeTest {

    private ContractEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new ContractEmployee("Priya", 3000, 102, 400);
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(3400, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(170, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(3230, employee.calculateNetSalary());
    }
}