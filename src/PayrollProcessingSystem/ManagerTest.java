package PayrollProcessingSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerTest {

    private Manager manager;

    @BeforeEach
    void setUp() {
        manager = new Manager("Dharshini", 5000, 103, 800, 300, 1000);
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(7100, manager.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(852, manager.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(6248, manager.calculateNetSalary());
    }
}