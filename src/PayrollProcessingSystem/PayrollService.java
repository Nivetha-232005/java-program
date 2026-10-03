package PayrollProcessingSystem;

import java.util.List;

public class PayrollService {
    public void processPayroll(List<Employee> employees) {

        for (Employee employee : employees) {
            System.out.println(" =========PayrollService==============");



            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Gross Salary: " + employee.calculateGrossSalary());
            System.out.println("Deduction: " + employee.calculateDeduction());
            System.out.println("Net Salary: " + employee.calculateNetSalary());
            System.out.println("----------------------------");
        }
    }
}