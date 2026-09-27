package PayrollProcessingSystem;

import java.util.List;

public class PayrollService {
    public void processPayroll(List<Employee> employees) {
        System.out.println(" =========PayrollService==============");
        for (Employee employee : employees) {

            double grossSalary = employee.calculateGrossSalary();
            double deduction = employee.calculateDeduction();
            double netSalary = grossSalary - deduction;
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Gross Salary: " + grossSalary);
            System.out.println("Deduction: " + deduction);
            System.out.println("Net Salary: " + netSalary);
            System.out.println("----------------------------");
        }
    }
}